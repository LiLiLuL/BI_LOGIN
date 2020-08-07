package com.tianma.BI_Process.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.OrgDim;

@Service
public interface OrgService {
	//增加一条组织信息 1-增加成功，0-增加失败
	 public  int  addOrg(OrgDim org);
	 //根据组织名称查询此组织是否存在1-表示已存在，0-表示不存在
	 public int findOrg(String orgname);
	 //根据组织code查询该组织的信息
	 public List<OrgDim> findOrgByCode(String code);
	 //查询所有的组织信息
	 public List<OrgDim> findAllOrgs();
	 //使组织信息生效 1-生效成功，0-生效失败
	 public int openOrg(Integer  id);
	 //使组织信息失效 1-失效成功，0-失效失败
	 public int closeOrg(Integer id);
	 //根据id值查找组织信息 1-查找成功，0-查找失败
	 public OrgDim findOrgById(Integer id);
	 //更新某条组织信息
	 public int updateOrg(OrgDim org);
	 
}
