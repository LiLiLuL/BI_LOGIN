package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.CategoryAdminDim;
import com.tianma.BI_Process.Domain.CategoryAdminDimExample;
import java.util.List;

public interface CategoryAdminDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CategoryAdminDim record);

    int insertSelective(CategoryAdminDim record);

    List<CategoryAdminDim> selectByExample(CategoryAdminDimExample example);

    CategoryAdminDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CategoryAdminDim record);

    int updateByPrimaryKey(CategoryAdminDim record);
}