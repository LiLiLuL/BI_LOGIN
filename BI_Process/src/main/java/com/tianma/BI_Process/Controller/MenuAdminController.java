package com.tianma.BI_Process.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianma.BI_Process.Domain.MenuAdminDim;
import com.tianma.BI_Process.Service.MenuAdminService;
import com.tianma.BI_Process.Util.Result;
import com.tianma.BI_Process.Util.ResultUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/menuAdmin")
public class MenuAdminController {

	
	
	@Autowired
	MenuAdminService menuAdminService;
	
	
	
	/***
	 * add Menu Administrator
	 * 
	 * @param menuAdminDim
	 * @return  1: success    0:failure
	 */
	@ApiOperation("添加菜单管理员")
	@ApiImplicitParam(name = "MenuAdminDim", value = "菜单管理表对象", required = true, dataType = "MenuAdminDim")
	@RequestMapping(value = "/addMenuAdmin", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result addMenuAdmin(@RequestBody MenuAdminDim menuAdminDim) {
		
		
		int flag = menuAdminService.addMenuAdmin(menuAdminDim);
		
		if (flag == 1) {
			return ResultUtil.success(1, "添加菜单管理员成功！");
		}else {
			return ResultUtil.error(0, "添加菜单管理员失败！");
		}
		
		
	}
	
	
	/***
	 * change Menu's Administrator
	 * 
	 * @param menuAdminDim
	 * @return 1:success   0:failure
	 */
	@ApiOperation("修改菜单管理员")
	@ApiImplicitParam(name = "MenuAdminDim", value = "菜单管理表对象", required = true, dataType = "MenuAdminDim")
	@RequestMapping(value = "/changeMenuAdmin", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result changeMenuAdmin(@RequestBody MenuAdminDim menuAdminDim) {
		
		int flag = menuAdminService.changeMenuAdmin(menuAdminDim);
		
		if (flag == 1) {
			return ResultUtil.success(1, "修改菜单管理员成功！");
		}else {
			return ResultUtil.error(0, "修改菜单管理员失败！");
		}
		
		
	}
	
	
}
