package com.tianma.BI_Process.Repository;

import com.tianma.BI_Process.Domain.MenuAdminDim;
import com.tianma.BI_Process.Domain.MenuAdminDimExample;
import java.util.List;

public interface MenuAdminDimMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuAdminDim record);

    int insertSelective(MenuAdminDim record);

    List<MenuAdminDim> selectByExample(MenuAdminDimExample example);

    MenuAdminDim selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuAdminDim record);

    int updateByPrimaryKey(MenuAdminDim record);
}