package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.CategoryDim;
import com.tianma.BI_Process.Domain.CategoryDimExample;
import java.util.List;

public interface CategoryDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CategoryDim record);

    int insertSelective(CategoryDim record);

    List<CategoryDim> selectByExample(CategoryDimExample example);

    CategoryDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CategoryDim record);

    int updateByPrimaryKey(CategoryDim record);
}