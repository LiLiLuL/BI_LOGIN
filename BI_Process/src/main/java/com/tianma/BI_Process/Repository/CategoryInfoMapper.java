package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.CategoryInfo;
import com.tianma.BI_Process.Domain.CategoryInfoExample;
import java.util.List;

public interface CategoryInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CategoryInfo record);

    int insertSelective(CategoryInfo record);

    List<CategoryInfo> selectByExample(CategoryInfoExample example);

    CategoryInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CategoryInfo record);

    int updateByPrimaryKey(CategoryInfo record);
}