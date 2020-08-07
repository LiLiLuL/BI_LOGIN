package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.ApprovalNodeDim;
import com.tianma.BI_Process.Domain.ApprovalNodeDimExample;
import java.util.List;

public interface ApprovalNodeDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApprovalNodeDim record);

    int insertSelective(ApprovalNodeDim record);

    List<ApprovalNodeDim> selectByExample(ApprovalNodeDimExample example);

    ApprovalNodeDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApprovalNodeDim record);

    int updateByPrimaryKey(ApprovalNodeDim record);
}