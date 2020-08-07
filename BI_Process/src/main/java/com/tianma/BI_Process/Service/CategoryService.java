package com.tianma.BI_Process.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.CategoryAdminDim;
import com.tianma.BI_Process.Domain.CategoryDim;
import com.tianma.BI_Process.Domain.CategoryInfo;
import com.tianma.BI_Process.Dto.CategoryAndUser;

@Service
public interface CategoryService {
    //1. 增加类型设置表数据
	public int addCate(CategoryDim reDim);
	 //2. 根据类别编码查找对应类型
	public List<CategoryDim> finDim(String code);
	
	//3.更新类型设置表数据
	public int updateCate(CategoryDim reDim);
	
	//4. 删除类型设置表数据
	public int deleteCate(String code);
	
	 //5. 增加类型设置明细表数据
	public int addCateInfo(CategoryInfo reInfo);
	//6. 根据类型参数编码查找对应参数信息
	public List<CategoryInfo> finInfo(String code);
		
	//7.更新类型参数明细表数据
	public int updateCateInfo(CategoryInfo reInfo);
		
	//8.根据类型参数编码查找到该数据并删除类型参数明细表数据
	public int deleteCateInfo(String code);
	
	//9.增加类型-管理员表数据
	public int addCateAdmin(CategoryAdminDim aDim);
	//10. 根据类别编码+类型编码查找对应管理员信息
	public List<CategoryAdminDim> finCateAdminInfoByCateAndInfo(String cateCode,String infoCode);
	    
	//11. 根据管理员编码查找其管理的类型信息
	public List<CategoryAdminDim> finCateAdminInfoByUser(String code);
	//12. 根据类型编码查找其管理的类型信息
	public List<CategoryAdminDim> finCateAdminByInfo(String code);			
	//13.删除类型-Admin信息表数据
	public int deleteAdminDim(CategoryAdminDim adminDim);
	
	//14. 根据类别编码+类型编码+管理员编码查找其管理的类型信息
	public List<CategoryAdminDim> finCateAdminInfoByCode(String catecode,String infocode, String usercode);
   //15.根据参数类型带出对应的人员信息
	public List<CategoryAndUser> findByParamCode	(String code);
   
	//16.根据管理员编码查询其管理的类别-参数-人员信息
	 public List<CategoryAndUser> findByUser(String code);
	
	//17. 更新类型-Admin信息表数据
	public int updateAdminDim(CategoryAdminDim caDim);
	//18. 根据类别编码查找其管理的类型信息
	public List<CategoryAdminDim> finCateAdminByCate(String code) ;
	//19.根据类别编码查询其管理的类别-参数-人员信息
	 public List<CategoryAndUser> findByCate(String code);
	
	 //20.查询所有的类别信息
	 public List<CategoryDim> getAllCategoryDims();
	 //21.查询所有的类别明细信息
	 public List<CategoryInfo> getAllCategoryInfos();
	 //22.查询所有的类型-Admin表信息
	 public List<CategoryAdminDim> getAllCategoryAdminDims();
	 //23. 查询所有的分类-属性-人员信息
	 public List<CategoryAndUser> getAllCategoryAndUsers();
	 
	 //查找所有的Admin-cate-parameter信息
	 public List<CategoryAdminDim> finAllCateAdminInfoByUser(String code);
//	 //24.根据编码或名称查询类别信息
//	 public List<CategoryDim> getCateByCodeOrName();
//	 //25.根据编码或名称查询类别属性信息
//	 public List<CategoryInfo> getInfoByCodeOrName();
	 
}
