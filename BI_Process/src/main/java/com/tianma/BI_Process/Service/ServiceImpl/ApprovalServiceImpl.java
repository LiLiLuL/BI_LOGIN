package com.tianma.BI_Process.Service.ServiceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties.Lettuce;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tianma.BI_Process.Domain.ApprovalCaseFact;
import com.tianma.BI_Process.Domain.ApprovalCaseFactExample;
import com.tianma.BI_Process.Domain.ApprovalCaseRecordFact;
import com.tianma.BI_Process.Domain.ApprovalCaseRecordFactExample;
import com.tianma.BI_Process.Domain.ApprovalDim;
import com.tianma.BI_Process.Domain.ApprovalDimExample;
import com.tianma.BI_Process.Domain.ApprovalNodeDim;
import com.tianma.BI_Process.Domain.ApprovalNodeDimExample;
import com.tianma.BI_Process.Domain.CategoryAdminDim;
import com.tianma.BI_Process.Domain.UserDim;
import com.tianma.BI_Process.Domain.UserDimExample;
import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Domain.UserFormInfoExample;
import com.tianma.BI_Process.Dto.ApprovalInfo;
import com.tianma.BI_Process.Dto.ApprovalInformation;
import com.tianma.BI_Process.Dto.CategoryAndUser;
import com.tianma.BI_Process.Repository.ApprovalCaseFactMapper;
import com.tianma.BI_Process.Repository.ApprovalCaseRecordFactMapper;
import com.tianma.BI_Process.Repository.ApprovalDimMapper;
import com.tianma.BI_Process.Repository.ApprovalNodeDimMapper;
import com.tianma.BI_Process.Repository.UserDimMapper;
import com.tianma.BI_Process.Repository.UserFormInfoMapper;
import com.tianma.BI_Process.Service.ApprovalService;
import com.tianma.BI_Process.Service.CategoryService;
import com.tianma.BI_Process.Service.UserService;

@Service
public class ApprovalServiceImpl  implements ApprovalService{
	 @Resource 
	 private ApprovalDimMapper approvalDao;
	 @Resource
	 private ApprovalNodeDimMapper nodeDao;
	 @Resource
	 private ApprovalCaseFactMapper  caseDao;
	 @Resource
	 private ApprovalCaseRecordFactMapper recordDao;
	 @Resource
	 private UserDimMapper userDao;
	 @Resource
	 private UserFormInfoMapper userFormDao;
	 @Resource
	 private UserService  uservice;
	 @Resource
	 private CategoryService cateservice;
	 
	 
	 //增加一个完整的审批流程
	 @Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
     public int addApproval(ApprovalInfo info) {
	        //判断新增的业务流程是否在数据库中已存在
			//true表示已经存在
			if(approvalDao.selectLike(info.getApproval_Name())) {
					return -1;
			}
			//添加流程信息至approval_dim表中
			ApprovalDim  aDim=new ApprovalDim();
			aDim.setApproval_Name(info.getApproval_Name());
			aDim.setCreate_User(info.getCreate_User());
			approvalDao.insert(aDim);
			//添加节点信息至approval_node_dim表中
			int id=aDim.getId();
			ApprovalNodeDim arr[]=info.getNodeArr();
			for (int i = 0; i < arr.length; i++) {	
			    ApprovalNodeDim  node=new ApprovalNodeDim ();
				node=arr[i];
				node.setApproval_Id(id);
				if(i==0) {
					node.setPrev_Node(0);			
				}else if(i==arr.length-1) {
					node.setNext_Node(0);
					
				}
				nodeDao.insertSelective(node);
		     }
			
		    List<ApprovalNodeDim> list=getNodesByApprovalId(id);
		    for (int i=0;i<list.size();i++) {
		    	ApprovalNodeDim node=list.get(i);
		    	 if(i==0) {
		    		node.setPrev_Node(0);
		    		node.setNext_Node(list.get(i+1).getId());
		    	 }else if(i==list.size()-1) {
		    		 node.setPrev_Node(list.get(i-1).getId());
		    		 node.setNext_Node(0);
		    	 }else {
		    		 node.setPrev_Node(list.get(i-1).getId());
		    		 node.setNext_Node(list.get(i+1).getId());
		    	 }
		    	 nodeDao.updateByPrimaryKeySelective(node);
				
			}
		
			return 1;				
		}
	 
	 //根据approval_id值查找所有的node节点信息
	 public List<ApprovalNodeDim> getNodesByApprovalId(Integer id){
		 ApprovalNodeDimExample example=new ApprovalNodeDimExample();
		 example.or().andApproval_IdEqualTo(id);
		 List<ApprovalNodeDim> list=nodeDao.selectByExample(example);
		 return list;
	 }
	 
		//增加一个流程实例,仅根据用户工号增加【已停用】
	    @Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
		public int addApprovalCaseByRole(UserFormInfo userInfo) {
	    	userInfo.setUser_Code(userInfo.getCreate_User());
	    	userInfo.setCase_Status(0);
	    	userFormDao.insertSelective(userInfo);
	    	ApprovalCaseFact  caseFact=new ApprovalCaseFact();
	    	caseFact.setCase_Status(0);
	    	caseFact.setCase_Title(userInfo.getCase_Title());
	    	caseFact.setApproval_Id(userInfo.getApproval_Id());
	    	caseFact.setCreate_Date(userInfo.getCreate_Date());
	    	caseFact.setUser_Name(userInfo.getUser_Name());
	    	caseFact.setCreate_User(userInfo.getCreate_User());
	    	caseFact.setEmail(userInfo.getEmail());
	    	caseDao.insertSelective(caseFact);
	    	int id=caseFact.getId();
	    	ApprovalCaseRecordFact  recordFact=new ApprovalCaseRecordFact();
	    	recordFact.setCase_Id(id);
	    	recordFact.setCreate_Date(userInfo.getCreate_Date());
	    	recordFact.setCreate_user(userInfo.getCreate_User());
	    	ApprovalNodeDim node=getNodesByApprovalId(userInfo.getApproval_Id()).get(0);
	    	//确定下一审批节点的审批人
	    	if(node.getNext_Node()==0) {
	    		recordFact.setOpration_user(1);
	    	}else {
	    		UserDim user=new UserDim();
	    		Integer next_node=node.getNext_Node();
		    	 ApprovalNodeDim nexNode=nodeDao.selectByPrimaryKey(next_node);
		    	 String oper_code=nexNode.getOper_Sign();
		    	 recordFact.setOpration_user(selecUsertByCode(oper_code));
	    	 	recordFact.setCurrenty_Node_Id(nexNode.getId());
	    	}
	    	recordDao.insertSelective(recordFact);
	    	return 1;
		}
	    
	  //判断哪些用户有需要审批的节点，并将需要审批的信息推送给审批人
		public List<UserFormInfo> getCheckList(){
			 List<UserFormInfo> resultList=new ArrayList<>();
			//首先找出流程实例表中正在运行的流程
			ApprovalCaseFactExample example=new ApprovalCaseFactExample();
			example.or().andCase_StatusEqualTo(0);
			List<ApprovalCaseFact> list=caseDao.selectByExample(example);
			
			if(list==null) {
				return null;
			}
			for(int i=0;i<list.size();i++) {
			     	//找到这个节点当前流程的审批人
				    ApprovalCaseRecordFactExample example2=new ApprovalCaseRecordFactExample();
				    example2.or().andCase_IdEqualTo(list.get(i).getId());
				     List<ApprovalCaseRecordFact>records=recordDao.selectByExample(example2);
				     ApprovalCaseRecordFact recordFact= records.get(records.size()-1);		
				     ApprovalCaseRecordFact firstFact=records.get(0);
				     //找到审批人的信息
				     UserDim userDim=userDao.selectByPrimaryKey(recordFact.getOpration_user());
				     String oper_User=userDim.getUser_Code();
				     Integer approval_Id=list.get(i).getApproval_Id();
				      UserFormInfo info=new UserFormInfo();
				      info.setUser_Code(firstFact.getCreate_user());
				      info.setCreate_Date(firstFact.getCreate_Date());
				      info.setApproval_Id(approval_Id);
//				     UserFormInfoExample example3=new UserFormInfoExample();
//				     example3.createCriteria().andUser_CodeEqualTo(value)
				     List<UserFormInfo> user_list=userFormDao.selectInfo(info);
				     if(user_list.size()!=0) {
				    	  user_list.get(0). setOper_Sign(oper_User);
				    	  resultList.add( user_list.get(0));		
				     }		      
			}
			
			return resultList;
				
			}
		
		// 根据用户的code找到其审批信息
		public List<UserFormInfo> theInfo(String userCode){
			List<UserFormInfo> infos=new ArrayList<UserFormInfo>();
			List<UserFormInfo> checkList=getCheckList();
			if(checkList!=null) {
				for (UserFormInfo userFormInfo : checkList) {
					if(userCode.equals(userFormInfo.getOper_Sign())) {
						infos.add(userFormInfo);
					}
					
				}
				
			}
			return infos;
		}
			
	
		//增加一个流程实例（根据用户角色分配：审批用户/普通用户)
		 @Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
		public int addApprovalCase(UserFormInfo userInfo) {

		    	//增加一个流程实例approval_case_fact
		    	ApprovalCaseFact  caseFact=new ApprovalCaseFact();
		    	caseFact.setCase_Status(0);
		    	caseFact.setCase_Title(userInfo.getCase_Title());
		    	caseFact.setApproval_Id(userInfo.getApproval_Id());
		    	caseFact.setCreate_Date(userInfo.getCreate_Date());
		    	caseFact.setUser_Name(userInfo.getUser_Name());
		    	caseFact.setCreate_User(userInfo.getCreate_User());
		    	caseFact.setEmail(userInfo.getEmail());
		    	caseDao.insertSelective(caseFact);
		    	
		    	//增加流程实例审批具体节点approval_case_fact_record
		    	int id=caseFact.getId();
		    	//将生成的case_id赋值给user_form_info并新增
		    	userInfo.setCase_Id(id);
		    	userInfo.setUser_Code(userInfo.getCreate_User());
		    	userInfo.setCase_Status(0);
		    	userFormDao.insertSelective(userInfo);
		    	ApprovalCaseRecordFact  recordFact=new ApprovalCaseRecordFact();
		    	recordFact.setCase_Id(id);
		    	recordFact.setCreate_Date(userInfo.getCreate_Date());
		    	recordFact.setCreate_user(userInfo.getCreate_User());
		    	ApprovalNodeDim node=getNodesByApprovalId(userInfo.getApproval_Id()).get(0);
		    	//确定下一审批节点的审批人
		    	if(node.getNext_Node()==0) {
		    		recordFact.setOpration_user(1);
		    		recordFact.setCase_Id(node.getId());
		    	}else {
		    		 UserDim user=new UserDim();
		    		 Integer next_node=node.getNext_Node();
			    	 ApprovalNodeDim nexNode=nodeDao.selectByPrimaryKey(next_node);
			    	 String oper_code=nexNode.getOper_Sign();
			    	 List<CategoryAdminDim> categoryAamins=cateservice.finCateAdminByInfo(oper_code);
			    	 String user_codeString=categoryAamins.get(0).getAdmin_Code();
			    	 recordFact.setOpration_user(selecUsertByCode(user_codeString));
		    	 	 recordFact.setCurrenty_Node_Id(node.getId());
		    	}
		    	recordDao.insertSelective(recordFact);
		    	return 1;
			
		}
	
		
			
		

//根据ApprovalCaseFact实例，在ApprovalCaseRecordFact表中找到所有相关的实例进程节点并按照时间排序
	public List<ApprovalCaseRecordFact> getProcessesByExample(ApprovalCaseFact wfcase){
		ApprovalCaseRecordFactExample process_example=new  ApprovalCaseRecordFactExample();
		   process_example.or().andCase_IdEqualTo(wfcase.getId());
		   List<ApprovalCaseRecordFact> process=recordDao.selectByExample(process_example);
		   //对找出的流程实例进程进行排序，选择最近的一条且其operation_result为null的数据为当前进行的节点
		   Collections.sort(process, new Comparator<ApprovalCaseRecordFact>() {
			   public int compare(ApprovalCaseRecordFact  p1,ApprovalCaseRecordFact p2) {
				   return p1.getCreate_Date().compareTo(p2.getCreate_Date());
			   }
		    });
		   return process;
	}
	
	//根据流程实例ID获得需要审批的相关信息，以及前面已经审核过的流程节点
		public UserFormInfo getTheItem(Integer id) {
			ApprovalCaseFact case1=caseDao.selectByPrimaryKey(id);
			UserFormInfo item=new UserFormInfo();
			item.setCreate_User(case1.getCreate_User());
			item.setCase_Title(case1.getCase_Title());
			item.setCreate_Date(case1.getCreate_Date());
			item.setUser_Code(case1.getUser_Code());
			return item;
					
		}
		
		//获取所有的审批流信息
		public List<ApprovalInfo> getAllApproval(){
			 List<ApprovalDim> approvalList=new ArrayList<>();
			 List<ApprovalInfo> list=new ArrayList<>();
			 approvalList=approvalDao.selectByExample(null);
			  for (int i=0;i<approvalList.size();i++) {
				   ApprovalInfo  approvalInfo=new ApprovalInfo();
				   approvalInfo.setApproval_Name(approvalList.get(i).getApproval_Name());
				   approvalInfo.setCreate_User(approvalList.get(i).getCreate_User());
				   approvalInfo.setId(approvalList.get(i).getId());
				   List<ApprovalNodeDim> nodeList=getNodesByApprovalId(approvalList.get(i).getId());
				   ApprovalNodeDim [] arr=new ApprovalNodeDim[nodeList.size()];
				   nodeList.toArray(arr);
				   approvalInfo.setNodeArr(arr);
				   String dept=new String();
				   for(int j=0;j<nodeList.size();j++) {
					   if(j==nodeList.size()-1) {
						   dept+=nodeList.get(j).getDescription();
					   }else {
						   dept=dept+nodeList.get(j).getDescription()+"->";
						   
					   }
				   }
				   approvalInfo.setNodeDept(dept);
				   list.add(approvalInfo);
			  }
			  return list;
			
		}
		//多条件查询根据user_Code、create_Date、approval_Id查询
		public List<UserFormInfo> getFormInfos(UserFormInfo info){
			return userFormDao.selectInfo(info);	       
		}
		
		//根据ID值用户填写的申请信息
		public UserFormInfo getFormInfo(Integer id) {
			return userFormDao.selectByPrimaryKey(id);
		}


		//更新审批信息（提交成功/失败的处理结果）
	 @Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
		public  int updateAppInfo(ApprovalInformation result) {
		 
		 ApprovalCaseRecordFact fact=new ApprovalCaseRecordFact();
			fact.setCreate_Date(result.getApproval_Date());
			fact.setCreate_user(result.getApproval_User());
			fact.setOpration_result(result.getApproval_result());
			fact.setOpration_reason(result.getApproval_Msg());
			fact.setCase_Id(result.getCase_Id());
			int case_id=result.getCase_Id();
			 ApprovalCaseFact caseFact=caseDao.selectByPrimaryKey(case_id);
			int res=result.getApproval_result();
			List<ApprovalCaseRecordFact> records=getCaseRecordsByCaseID(case_id);
			ApprovalCaseRecordFact lastRecord=records.get(records.size()-1);
			//更新UserformInfo信息，先找到对应的user记录
			ApprovalCaseRecordFact firstRecord=records.get(0);
			UserFormInfo usertemp=new UserFormInfo();
			usertemp.setCreate_Date(result.getCreate_Date());
			usertemp.setUser_Code(result.getCreate_User_Code());
			UserFormInfo user=userFormDao.selectByCodeAndTime(usertemp).get(0);
			int nodeId=lastRecord.getCurrenty_Node_Id();
			ApprovalNodeDim nextNodeDim1=nodeDao.selectByPrimaryKey(selectById(nodeId));
			int nextNode=nextNodeDim1.getNext_Node();
			
			if(res==2){//节点被拒绝
				fact.setCurrenty_Node_Id(firstRecord.getCurrenty_Node_Id());
				fact.setOpration_user(1); //1表示流程已结束
				recordDao.insertSelective(fact);
				caseFact.setCase_Status(2);
				caseDao.updateByPrimaryKeySelective(caseFact);
				user.setCase_Status(2);//2表示拒绝
				//更新用户user_form_info信息
				userFormDao.updateByPrimaryKeySelective(user);			
				return 2;
			}
			if(nextNode==0&&res==1) { //当前节点是结束节点且已点击通过
				ApprovalNodeDim node=nodeDao.selectByPrimaryKey(nodeId);
				fact.setCurrenty_Node_Id(node.getNext_Node());
				fact.setOpration_user(1);
				recordDao.insertSelective(fact);
				caseFact.setCase_Status(1);
				caseDao.updateByPrimaryKeySelective(caseFact);
				user.setCase_Status(1);//1表示通过
				//增加用户信息
				userFormDao.updateByPrimaryKeySelective(user);
				UserDim userInfo=new UserDim();				
				userInfo.setCreate_Date(result.getApproval_Date());
			    userInfo.setDept(result.getDept());
			    userInfo.setInvalid_Flag(true);
			    userInfo.setPhone_Number(result.getPhone_Number());
			    userInfo.setUser_Code(result.getCreate_User_Code());
			    userInfo.setUser_Name(result.getUser_Name());
			    userInfo.setEmail(result.getEmail());
				uservice.addUser(userInfo);				
			}else {
				ApprovalNodeDim node=nodeDao.selectByPrimaryKey(nodeId);
				fact.setCurrenty_Node_Id(node.getNext_Node());
				ApprovalNodeDim nextNodeDim=nodeDao.selectByPrimaryKey(node.getNext_Node());
				int userid=getOperSign(nextNodeDim.getNext_Node());
				fact.setOpration_user(userid);
				recordDao.insertSelective(fact);		
			}
			return 1;
			
	 }
	 
	 
	 //根据case_id查询其所有的审批值
	 public List<ApprovalCaseRecordFact> getCaseRecordsByCaseID(Integer case_Id){
		 ApprovalCaseRecordFactExample example=new ApprovalCaseRecordFactExample();
		 example.or().andCase_IdEqualTo(case_Id);
		 List<ApprovalCaseRecordFact> list=recordDao.selectByExample(example);
		 for(int i=0;i<list.size();i++) {
			 String code=list.get(i).getCreate_user();
			 String code1=list.get(i).getModify_user();
			 String username;
			 if(i==0) {
				 username=selctUserFormInfosByCode(code).get(0).getUser_Name();				 
			 }else {
				 username=selecUserInfoByCode(code).getUser_Name();
				 list.get(i).setCreate_Date(list.get(i).getCreate_Date());
			 }
			 list.get(i).setCreate_user(username);
			 
		 }
		 return list;
		 
	 }
	 
	 
	 
	 //查询当前流程节点是否是结束节点
	 public int selectById(Integer id) {
		 ApprovalNodeDim node=nodeDao.selectByPrimaryKey(id);
		 int res=node.getNext_Node();
		 if(res==0) {
			 return 0;
		 }
		 return res;
	 }
	  //根据用户的工号找到其ID值
	 public int selecUsertByCode(String code) {
		 UserDimExample example=new UserDimExample();
		 example.or().andUser_CodeEqualTo(code);		 
		  UserDim user=userDao.selectByExample(example).get(0);
		  return user.getId();
	 }
	 
	//根据用户的工号找到其信息
		 public UserDim selecUserInfoByCode(String code) {
			 UserDimExample example=new UserDimExample();
			 example.or().andUser_CodeEqualTo(code);		 
			  UserDim user=userDao.selectByExample(example).get(0);
			  return user;
		 }
	//根据用户工号查找其用户信息
		 public List<UserFormInfo> selctUserFormInfosByCode(String code){
			 UserFormInfoExample example=new UserFormInfoExample();
			 example.or().andCreate_UserEqualTo(code);
			 List<UserFormInfo> list=userFormDao.selectByExample(example);
			 return list;
		 }
		 
		 //根据nodeid找到下一节点的审批人ID
		 public int getOperSign(Integer id) {
			 ApprovalNodeDim nodeDim=nodeDao.selectByPrimaryKey(id);
			 String role=nodeDim.getOper_Sign();
			 List<CategoryAndUser> list=cateservice.findByParamCode(role);
			 String usercode=list.get(0).getUser_Code();
			 int userid=selecUsertByCode(usercode);
			 return userid;
			 
		 }
		 

}
