package com.tianma.BI_Process.Service.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.OrgDim;
import com.tianma.BI_Process.Domain.OrgDimExample;
import com.tianma.BI_Process.Repository.OrgDimMapper;
import com.tianma.BI_Process.Service.OrgService;

@Service
public class OrgServiceImpl implements OrgService{
	@Resource
	 OrgDimMapper  orgDao;
	//增加一条组织信息0--名称已存在，1--增加成功
	 public  int  addOrg(OrgDim org) {
		 String name=org.getOrg_Name();
		 if(findOrg(name)==1) {
			 return 0;	 
		 }
		 Integer pid=Integer.valueOf(org.getParent_Department());
		 if(org.getInvalid_Flag()==null) {
			 org.setInvalid_Flag(true);
		 }
		 if(pid==0) {
			 org.setLevel_Flag("0");			 
		 }else {
			 OrgDim orgDim=orgDao.selectByPrimaryKey(pid);
			 String level=orgDim.getLevel_Flag()+"."+pid;
			 org.setLevel_Flag(level);		 
		 }
		  orgDao.insertSelective(org);
		   return 1;	 
	 }
	//根据组织名称查询此组织是否存在1-表示已存在，0-表示不存在
	 public int findOrg(String orgname) {
		 OrgDimExample example=new OrgDimExample();
		 example.or().andOrg_NameEqualTo(orgname);
		 List<OrgDim> list=orgDao.selectByExample(example);
		 if(list.size()==0) {
			 return 0;
		 }
		 return 1;
	 }
	 //根据组织code查询该组织的信息
	 public List<OrgDim> findOrgByCode(String code){
		 OrgDimExample example=new OrgDimExample();
		 example.or().andOrg_CodeEqualTo(code);
		 List<OrgDim> org=orgDao.selectByExample(example);
		 return org;
	 }
	//查询所有的组织信息
	public List<OrgDim> findAllOrgs(){
		OrgDimExample example=new OrgDimExample();
		 example.or().andInvalid_FlagEqualTo(true);
		 List<OrgDim> org=orgDao.selectByExample(example);
		 return org;
			 
    }
	 //使组织信息生效 1-生效成功，0-生效失败
	 public int openOrg(Integer  id) {
		 OrgDim org=orgDao.selectByPrimaryKey(id);
		 org.setInvalid_Flag(true);
		 orgDao.updateByPrimaryKey(org);
		 return 1;
		 
	 }
	 //使组织信息失效 1-失效成功，0-失效失败
	 public int closeOrg(Integer id) {
		 OrgDim org=orgDao.selectByPrimaryKey(id);
		 org.setInvalid_Flag(false);
		 orgDao.updateByPrimaryKey(org);
		 return 1;
	 }
	 //根据id值查找组织信息1-查找成功，0-查找失败
	 public  OrgDim findOrgById(Integer id) {
		 OrgDim org=orgDao.selectByPrimaryKey(id);
		 return org;
	 }
	//更新某条组织信息
	 public int updateOrg(OrgDim org) {
		 String name=org.getOrg_Name();
		 OrgDim orgDim1=orgDao.selectByPrimaryKey(org.getId());
		 if(! name.equals(orgDim1.getOrg_Name()) && findOrg(name)==1) {
			 return 0;	 
		 }
		 if(org.getInvalid_Flag()==null) {
			 org.setInvalid_Flag(true);
		 }
		 Integer pid=Integer.valueOf(org.getParent_Department());
		 if(pid==0) {
			 org.setLevel_Flag("0");			 
		 }else {
			 OrgDim orgDim=orgDao.selectByPrimaryKey(pid);
			 String level=orgDim.getLevel_Flag()+"."+pid;
			 org.setLevel_Flag(level);		 
		 }
		 orgDao.updateByPrimaryKey(org);
		 return 1;
	 }
	 
}
