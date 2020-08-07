package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.OrgAdminDim;
import com.tianma.BI_Process.Domain.OrgAdminDimExample;
import java.util.List;

public interface OrgAdminDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrgAdminDim record);

    int insertSelective(OrgAdminDim record);

    List<OrgAdminDim> selectByExample(OrgAdminDimExample example);

    OrgAdminDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrgAdminDim record);

    int updateByPrimaryKey(OrgAdminDim record);
}