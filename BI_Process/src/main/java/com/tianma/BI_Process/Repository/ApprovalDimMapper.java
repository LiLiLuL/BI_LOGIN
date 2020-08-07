package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.ApprovalDim;
import com.tianma.BI_Process.Domain.ApprovalDimExample;
import java.util.List;

public interface ApprovalDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApprovalDim record);

    int insertSelective(ApprovalDim record);

    List<ApprovalDim> selectByExample(ApprovalDimExample example);

    ApprovalDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApprovalDim record);

    int updateByPrimaryKey(ApprovalDim record);
    
    Boolean selectLike(String approval_name);
}