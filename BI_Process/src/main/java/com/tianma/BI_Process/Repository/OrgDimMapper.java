package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.OrgDim;
import com.tianma.BI_Process.Domain.OrgDimExample;
import java.util.List;

public interface OrgDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrgDim record);

    int insertSelective(OrgDim record);

    List<OrgDim> selectByExample(OrgDimExample example);

    OrgDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrgDim record);

    int updateByPrimaryKey(OrgDim record);
}