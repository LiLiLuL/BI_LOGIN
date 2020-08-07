package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.MenuDim;
import com.tianma.BI_Process.Domain.MenuDimExample;
import java.util.List;

public interface MenuDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuDim record);

    int insertSelective(MenuDim record);

    List<MenuDim> selectByExample(MenuDimExample example);

    MenuDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuDim record);

    int updateByPrimaryKey(MenuDim record);
}