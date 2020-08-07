package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.UserDim;
import com.tianma.BI_Process.Domain.UserDimExample;
import java.util.List;

public interface UserDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDim record);

    int insertSelective(UserDim record);

    List<UserDim> selectByExample(UserDimExample example);

    UserDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDim record);

    int updateByPrimaryKey(UserDim record);
}