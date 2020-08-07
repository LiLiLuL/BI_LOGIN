package com.tianma.BI_Process.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.MenuAdminDim;
import com.tianma.BI_Process.Repository.MenuAdminDimMapper;
import com.tianma.BI_Process.Service.MenuAdminService;



@Service
public class MenuAdminServiceImpl implements MenuAdminService {

	
	@Autowired
	MenuAdminDimMapper menuAdminDimMapper;
	
	
	/***
	 * add Menu's Administrator
	 * 
	 * return   1：success    0：failure
	 */
	@Override
	public int addMenuAdmin(MenuAdminDim menuAdminDim) {
		// TODO Auto-generated method stub
		try {
			menuAdminDimMapper.insertSelective(menuAdminDim);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		
	}

	
/***
 * change Menu Administrator
 * 
 * return  1:success   0:failure
 */
	@Override
	public int changeMenuAdmin(MenuAdminDim menuAdminDim) {
		// TODO Auto-generated method stub
		try {
			menuAdminDimMapper.updateByPrimaryKeySelective(menuAdminDim);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

}
