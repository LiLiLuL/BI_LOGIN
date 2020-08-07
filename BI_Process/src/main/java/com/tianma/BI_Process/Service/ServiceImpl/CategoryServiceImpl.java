package com.tianma.BI_Process.Service.ServiceImpl;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tianma.BI_Process.Domain.CategoryAdminDim;
import com.tianma.BI_Process.Domain.CategoryAdminDimExample;
import com.tianma.BI_Process.Domain.CategoryDim;
import com.tianma.BI_Process.Domain.CategoryDimExample;
import com.tianma.BI_Process.Domain.CategoryDimExample.Criteria;
import com.tianma.BI_Process.Domain.CategoryInfo;
import com.tianma.BI_Process.Domain.CategoryInfoExample;
import com.tianma.BI_Process.Domain.UserDim;
import com.tianma.BI_Process.Domain.UserDimExample;
import com.tianma.BI_Process.Dto.CategoryAndUser;
import com.tianma.BI_Process.Repository.CategoryAdminDimMapper;
import com.tianma.BI_Process.Repository.CategoryDimMapper;
import com.tianma.BI_Process.Repository.CategoryInfoMapper;
import com.tianma.BI_Process.Repository.UserDimMapper;
import com.tianma.BI_Process.Service.CategoryService;
import com.tianma.BI_Process.Service.UserService;

/**
 * 
 * @author Administrator
 * 1--成功   0--失败     -1--该信息已存在  2--该数据不存在
 *
 */
@Service
public class CategoryServiceImpl  implements CategoryService{
	@Resource 
	private CategoryAdminDimMapper  cadminDao;
	@Resource 
	private CategoryDimMapper  cateDao;
	@Resource
	private CategoryInfoMapper infoDao;
	@Resource
	private  UserDimMapper userDao;
	
	    //1. 增加类型设置表数据 
		public int addCate(CategoryDim reDim) {
			String code=reDim.getCategory_Code();
			reDim.setInvalid_Flag(true);
			List <CategoryDim> list=finDim(code);
			if(list.size()!=0) {
				return -1;
			}
			 cateDao.insertSelective(reDim);
			 return 1;
		}
		 //2. 根据类别编码查找对应类型
		public List<CategoryDim> finDim(String code) {
			 CategoryDimExample example=new CategoryDimExample();
			 example.createCriteria()
			                .andCategory_CodeEqualTo(code)
			                .andInvalid_FlagEqualTo(true);
			 List<CategoryDim> list=cateDao.selectByExample(example);
			return list;		 
		}
		
		//3.更新类型设置表数据
		public int updateCate(CategoryDim reDim) {
			String code=reDim.getCategory_Code();
			List <CategoryDim> list=finDim(code);
			if(list.size()>0) {
				return -1;
			}
			cateDao.updateByPrimaryKeySelective(reDim);
			
			return 1;
		}
		
		//4. 删除类型设置表数据
		@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
		public int deleteCate(String code) {
			CategoryDim cateDim=finDim(code).get(0);
			cateDim.setInvalid_Flag(false);
			updateCate(cateDim);
			List<CategoryAdminDim> list=finCateAdminByCate(code);
			if(! list.isEmpty()) {
				deleteCategoryAndAdmin(list);
			}
			return 1;
			
		}
		
		 //5. 增加类型设置明细表数据
		public int addCateInfo(CategoryInfo reInfo) {
			String code=reInfo.getParameter_Code();
			List<CategoryInfo> list=finInfo(code);
			if(list.size()==0) {
				reInfo.setInvalid_Flag(true);
				infoDao.insertSelective(reInfo);
				return 1;
			}
			return -1;
		}
		//6. 根据类型参数编码查找对应参数信息
		public List<CategoryInfo> finInfo(String code){
			CategoryInfoExample example=new CategoryInfoExample();
			example.createCriteria()
			              .andParameter_CodeEqualTo(code)
			              .andInvalid_FlagEqualTo(true);
			List<CategoryInfo> list=infoDao.selectByExample(example);
		    return list;
		}
			
		//7.更新类型参数明细表数据
		public int updateCateInfo(CategoryInfo reInfo) {
			String code=reInfo.getParameter_Code();
			List <CategoryInfo> list=finInfo(code);
			if(! list.isEmpty()) {
				return -1;
			}
			infoDao.updateByPrimaryKeySelective(reInfo);
			return 1;
		}
			
	//8.根据类型参数编码查找到该数据并删除类型参数明细表数据
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public int deleteCateInfo(String code) {
		   CategoryInfo info=finInfo(code).get(0);
		   info.setInvalid_Flag(false);
		   updateCateInfo(info);
		   List<CategoryAdminDim> list=finCateAdminByInfo(code);
		   if(! list.isEmpty()) {
			   deleteCategoryAndAdmin(list);
		   }
		   return 1;
	}
		
		//9.增加类型-管理员表数据
		public int addCateAdmin(CategoryAdminDim aDim) {
			String cateCode=aDim.getCategory_Code();
			String infoCode=aDim.getParameter_Code();
			String adminCodeString=aDim.getAdmin_Code();
			List<CategoryAdminDim> list =finCateAdminInfoByCode(cateCode, infoCode, adminCodeString);
			if(! list.isEmpty()) {
				return -1;
			}
			aDim.setInvalid_Flag(true);
			cadminDao.insertSelective(aDim);
			return 1;
		}
		//10. 根据类型编码查找对应管理员信息
		public List<CategoryAdminDim> finCateAdminInfoByCateAndInfo(String cateCode,String infoCode) {
			CategoryAdminDimExample  example=new CategoryAdminDimExample();
			example.createCriteria()
			              .andCategory_CodeEqualTo(cateCode)
			              .andParameter_CodeEqualTo(infoCode)
			              .andInvalid_FlagEqualTo(true);
			List<CategoryAdminDim> list=cadminDao.selectByExample(example);
			return list;
		}
		    
		//11. 根据管理员编码查找其管理的类型信息
		public List<CategoryAdminDim> finCateAdminInfoByUser(String code) {
			CategoryAdminDimExample  example=new CategoryAdminDimExample();
			example.createCriteria()
			              .andAdmin_CodeEqualTo(code)
			              .andInvalid_FlagEqualTo(true);
			List<CategoryAdminDim> list=cadminDao.selectByExample(example);
			return list;
		}
		
		//12. 根据类型编码查找其管理的类型信息
		public List<CategoryAdminDim> finCateAdminByInfo(String code) {
			CategoryAdminDimExample  example=new CategoryAdminDimExample();
			example.createCriteria()
			              .andParameter_CodeEqualTo(code)
			              .andInvalid_FlagEqualTo(true);
			List<CategoryAdminDim> list=cadminDao.selectByExample(example);
			return list;
		}
	
				
		//13.删除类型-Admin信息表数据
		public int deleteAdminDim(CategoryAdminDim adminDim) {
			adminDim.setInvalid_Flag(false);
			cadminDao.updateByPrimaryKeySelective(adminDim);
			return 1;		  
		}
		
		//14. 根据管理员编码+类型编码+类别编码唯一查找其管理的类型信息
		public List<CategoryAdminDim> finCateAdminInfoByCode(String catecode,String infocode, String usercode) {
					CategoryAdminDimExample  example=new CategoryAdminDimExample();
					example.createCriteria()
					              .andAdmin_CodeEqualTo(usercode)
					              .andCategory_CodeEqualTo(catecode)
					              .andParameter_CodeEqualTo(infocode)
					              .andInvalid_FlagEqualTo(true);
					List<CategoryAdminDim> list=cadminDao.selectByExample(example);
					return list;
				}
    //15.根据参数类型带出对应的类别-参数-人员信息
		public List<CategoryAndUser> findByParamCode	(String code){
			 List<CategoryAdminDim> categoryAdminDims=finCateAdminByInfo(code);
			 List<CategoryAndUser> result=getCategoryAndUsers(categoryAdminDims);			
			return result;	 
			 
			
		}
		//16.根据管理员编码查询其管理的类别-参数-人员信息
		 public List<CategoryAndUser> findByUser(String code){
			 List<CategoryAdminDim>  categoryAdminDims=finCateAdminInfoByUser(code);
			 List<CategoryAndUser> result=getCategoryAndUsers(categoryAdminDims);
			return result;	 
		 }
		
			//17. 更新类型-Admin信息表数据
			public int updateAdminDim(CategoryAdminDim caDim) {
			       cadminDao.updateByPrimaryKeySelective(caDim);
			       return 1;		
			}
			//18. 根据类别编码查找其管理的类型信息
			public List<CategoryAdminDim> finCateAdminByCate(String code) {
				CategoryAdminDimExample  example=new CategoryAdminDimExample();
				example.createCriteria()
				              .andCategory_CodeEqualTo(code)
				              .andInvalid_FlagEqualTo(true);
				List<CategoryAdminDim> list=cadminDao.selectByExample(example);
				return list;
			}
			//19.根据类别编码查询其管理的类别-参数-人员信息
			 public List<CategoryAndUser> findByCate(String code){
				 List<CategoryAdminDim>  categoryAdminDims=finCateAdminByCate(code);
				 List<CategoryAndUser> result=getCategoryAndUsers(categoryAdminDims);
				return result;	 
			 }
			 //20.查询所有的类别信息
			 public List<CategoryDim> getAllCategoryDims(){
			    CategoryDimExample example=new CategoryDimExample();
			    example.or().andInvalid_FlagEqualTo(true);
				List<CategoryDim> list= cateDao.selectByExample(example);
				return list;
			 }
			 //21.查询所有的类别明细信息
			 public List<CategoryInfo> getAllCategoryInfos(){
				 CategoryInfoExample example=new CategoryInfoExample();
				 example.or().andInvalid_FlagEqualTo(true);
				 List<CategoryInfo> list=infoDao.selectByExample(example);
				 return list;
			 }
			 //22.查询所有的类型-Admin表信息
			 public List<CategoryAdminDim> getAllCategoryAdminDims(){
				 CategoryAdminDimExample example=new CategoryAdminDimExample();
				 example.or().andInvalid_FlagEqualTo(true);
				 List<CategoryAdminDim> list=cadminDao.selectByExample(example);
				 return list;
			 }
			 //23. 查询所有的分类-属性-人员信息
			 public List<CategoryAndUser> getAllCategoryAndUsers(){
				 List<CategoryAdminDim> categoryAdminDims=getAllCategoryAdminDims();
				 List<CategoryAndUser> list=getCategoryAndUsers(categoryAdminDims);
				 return list;
			 }
			 //24.查找所有的Admin-cate-parameter信息
			 public List<CategoryAdminDim> finAllCateAdminInfoByUser(String code){
					CategoryAdminDimExample  example=new CategoryAdminDimExample();
					example.createCriteria()
					              .andAdmin_CodeEqualTo(code);
					List<CategoryAdminDim> list=cadminDao.selectByExample(example);
					return list;     
			 }
			 
//			 //24.根据编码或名称查询类别信息
//			 public List<CategoryDim> getCateByCodeOrName(){
//				 
//			 }
//			 //25.根据编码或名称查询类别属性信息
//			 public List<CategoryInfo> getInfoByCodeOrName(){
//				 
//			 }
			
		 
		 private List<UserDim> findUserByCode(String code){
			 UserDimExample example=new UserDimExample();
			 example.createCriteria().andUser_CodeEqualTo(code).andInvalid_FlagEqualTo(true);
			 List<UserDim> list=userDao.selectByExample(example);
			 return list;
		 }
		 //批量删除类别-Admin中的数据
		 public int deleteCategoryAndAdmin(List<CategoryAdminDim> categoryAdminDims) {
			 for(int i=0;i<categoryAdminDims.size();i++) {
				 categoryAdminDims.get(i).setInvalid_Flag(false);
				 updateAdminDim(categoryAdminDims.get(i));
			 }
			 return 1;
		 }
			//根据类别-Admin集合得到完整的category-user对应关系
			public List<CategoryAndUser> getCategoryAndUsers(List<CategoryAdminDim> categoryAdminDims){
				 List<CategoryAndUser> result=new ArrayList<>();
				 for(int i=0;i<categoryAdminDims.size();i++) {
						CategoryAndUser item=new CategoryAndUser();
						String category_code=categoryAdminDims.get(i).getCategory_Code();
						String param_code=categoryAdminDims.get(i).getParameter_Code();
						String admin_code=categoryAdminDims.get(i).getAdmin_Code();
						CategoryDim categoryDim=finDim(category_code).get(0);
						CategoryInfo categoryInfo=finInfo(param_code).get(0);
						UserDim userDim=findUserByCode(admin_code).get(0);
						item.setCategory_Code(category_code);
						item.setParameter_Code(param_code);
						item.setUser_Code(admin_code);
						item.setCategory_Name(categoryDim.getCategory_Name());
						item.setParameter_Name(categoryInfo.getParameter_Name());
						item.setParameter_Description(categoryInfo.getParameter_Description());
						item.setCreate_Date(categoryAdminDims.get(i).getCreate_Date());
						item.setCreate_User(categoryAdminDims.get(i).getCreate_User());
						item.setOper_Sign(categoryAdminDims.get(i).getOper_Sign());
						item.setRecord_Date(categoryAdminDims.get(i).getRecord_Date());
						item.setUser_Name(userDim.getUser_Name());
						item.setEmail(userDim.getEmail());
						item.setDept(userDim.getDept());
						item.setPhone_Number(userDim.getPhone_Number());
						result.add(item);				
					}
					return result;	 
				 
			}
			 
		 }

