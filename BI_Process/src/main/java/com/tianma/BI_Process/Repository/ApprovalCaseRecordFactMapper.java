package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.ApprovalCaseRecordFact;
import com.tianma.BI_Process.Domain.ApprovalCaseRecordFactExample;

import java.sql.Date;
import java.util.List;

public interface ApprovalCaseRecordFactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApprovalCaseRecordFact record);

    int insertSelective(ApprovalCaseRecordFact record);

    List<ApprovalCaseRecordFact> selectByExample(ApprovalCaseRecordFactExample example);

    ApprovalCaseRecordFact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApprovalCaseRecordFact record);

    int updateByPrimaryKey(ApprovalCaseRecordFact record);
    //根据用户工号和时间查询记录
    List<ApprovalCaseRecordFact> selectByCodeAndDate(ApprovalCaseRecordFact fact);
}