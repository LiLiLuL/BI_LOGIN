package com.tianma.BI_Process.Service;

import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.MenuAdminDim;


@Service
public interface MenuAdminService {
	
	
	//add Menu's Administrator
public int addMenuAdmin(MenuAdminDim menuAdminDim) ;

	//change Menu's Administrator
public int changeMenuAdmin(MenuAdminDim menuAdminDim);


}
