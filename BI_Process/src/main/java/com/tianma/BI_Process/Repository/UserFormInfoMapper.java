package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Domain.UserFormInfoExample;

import java.util.Date;
import java.util.List;

public interface UserFormInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserFormInfo record);

    int insertSelective(UserFormInfo record);

    List<UserFormInfo> selectByExample(UserFormInfoExample example);
    
    List<UserFormInfo> selectInfo(UserFormInfo info);

    UserFormInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFormInfo record);

    int updateByPrimaryKey(UserFormInfo record);
    
    List<UserFormInfo> selectByCodeAndTime(UserFormInfo info);
    
}