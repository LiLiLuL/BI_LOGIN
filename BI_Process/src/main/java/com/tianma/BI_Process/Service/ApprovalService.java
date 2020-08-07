package com.tianma.BI_Process.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.ApprovalCaseFact;
import com.tianma.BI_Process.Domain.ApprovalCaseRecordFact;
import com.tianma.BI_Process.Domain.ApprovalNodeDim;
import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Dto.ApprovalInfo;
import com.tianma.BI_Process.Dto.ApprovalInformation;


@Service
public interface ApprovalService {
       //1.增加一个完整的审批流程
		public int addApproval(ApprovalInfo info);
		//2.根据流程ID得到其所有的流程节点
		public  List<ApprovalNodeDim>  getNodesByApprovalId(Integer id);
		//3.增加一个流程实例
		public int addApprovalCase(UserFormInfo userInfo);
		
		//4.判断哪些用户有需要审批的节点
		public List<UserFormInfo> getCheckList();
		
		//5.获取所有的审批流信息
		public List<ApprovalInfo> getAllApproval();
		//6.根据用户id获取中间表的所有信息
		public List<UserFormInfo> theInfo(String userCode);
		//7.根据ID值用户填写的申请信息
		public UserFormInfo getFormInfo(Integer id);
		//8.更新审批信息
		public  int updateAppInfo(ApprovalInformation result);
		
		//9.增加一个流程实例（根据用户角色分配：审批用户/普通用户)
		public int addApprovalCaseByRole(UserFormInfo userInfo);
		
		//10. 根据case_id查询其所有的审批值
		public List<ApprovalCaseRecordFact> getCaseRecordsByCaseID(Integer case_Id);
		
		
	   
}
