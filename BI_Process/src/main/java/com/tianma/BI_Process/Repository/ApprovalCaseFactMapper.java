package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.ApprovalCaseFact;
import com.tianma.BI_Process.Domain.ApprovalCaseFactExample;
import java.util.List;

public interface ApprovalCaseFactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApprovalCaseFact record);

    int insertSelective(ApprovalCaseFact record);

    List<ApprovalCaseFact> selectByExample(ApprovalCaseFactExample example);

    ApprovalCaseFact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApprovalCaseFact record);

    int updateByPrimaryKey(ApprovalCaseFact record);
}