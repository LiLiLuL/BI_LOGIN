package com.tianma.BI_Process.Controller;


import java.util.List;

import org.apache.ibatis.io.ResolverUtil.IsA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.tianma.BI_Process.Domain.OrgDim;
import com.tianma.BI_Process.Domain.UserDim;
import com.tianma.BI_Process.Domain.UserDimExample;
import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Dto.LoginInfo;
import com.tianma.BI_Process.Repository.UserDimMapper;
import com.tianma.BI_Process.Service.OrgService;
import com.tianma.BI_Process.Service.UserService;
import com.tianma.BI_Process.Util.Result;
import com.tianma.BI_Process.Util.ResultEnum;
import com.tianma.BI_Process.Util.ResultUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/user")
public class UserController {

	
	@Autowired
	UserService userService;
	@Autowired
	UserDimMapper userDimMapper;
	
	
	
	/*	 
	
	//增加一条组织信息
@ApiOperation("增加一个组织信息")
@ApiImplicitParam(name="addOrgInformation",value="组织信息",required=true,dataType="OrgDim")
@RequestMapping(value="/addorg",method= {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result addOrg(@RequestBody  OrgDim  orgDim) {
	int res=orgService.addOrg(orgDim);
	if(res==1) {
		return ResultUtil.success();
	}else if(res==0) {
		return ResultUtil.error(11, "组织名称重复，增加组织信息失败");
	}
	System.out.println("test");
	return ResultUtil.error(500, "服务器错误");
}
*/

/***
 * add user
 * @param userDim
 * @return 1：success    0：failure
 */
@ApiOperation("增加用户")
@ApiImplicitParam(name = "userDim", value = "用户的信息", required = true, dataType = "UserDim")
@RequestMapping(value = "/addUser", method = {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result addUser(@RequestBody UserDim userDim) {
	
	//use the impl's function to add user
	int flag = userService.addUser(userDim);
	
	//judge add user success or not
	if (flag==1) {
		return ResultUtil.success(1, "添加成功！");
	}else if (flag==2) {
		return ResultUtil.error(2, "人员重复！");
	}else {
		return ResultUtil.error(0, "添加失败！");
	} 

}




/***
 * delete user
 * @param userDim
 * @return  1：success    0：failure
 */
@ApiOperation("删除用户")
@ApiImplicitParam(name = "userDim", value = "需要删除的对象", required = true, dataType = "userDim")
@RequestMapping(value = "/deleteUser", method = {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result deleteUser(@RequestBody UserDim userDim) {
	System.out.println(userDim);
	//use impl's function to delete user
	int flag = userService.deleteUser(userDim);
	
	//judge delete success or not 
	if (flag==1) {
		return ResultUtil.success(1, "删除成功！");
	}else {
		return ResultUtil.error(0, "删除失败！");
	}
}
     

/***
 * change user
 * @param userDim
 * @return  1：success    0：failure
 */
@ApiOperation("修改用户")
@ApiImplicitParam(name = "userDim", value = "需要修改的对象", required = true, dataType = "userDim")
@RequestMapping(value = "/changeUser", method = {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result changeUser(@RequestBody UserDim userDim) {
	
	//use impl's function to delete user
	int flag = userService.changeUser(userDim);
	
	//judge delete success or not 
	if (flag==1) {
		return ResultUtil.success(1, "修改成功！");
	}else {
		return ResultUtil.error(0, "修改失败！");
	}
}




/***
 * get user by code
 * @param userCode
 * @return  user's list
 */
@ApiOperation("查询用户")
@ApiImplicitParam(name = "user code", value = "需要查询的对象code", required = true, dataType = "String")
@RequestMapping(value = "/selectUserByCode", method = {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result getUserByCode(@RequestParam String userCode) {
	
	//use impl's function to delete user
	Result result = userService.getUserByCode(userCode);
	int success_flag = result.getCode();
	//judge delete success or not
	if (success_flag==1) {
		return ResultUtil.success(result.getData(), "查询成功！");
	}else {
		return ResultUtil.error(0, "查询失败！");
	}
}





/***
 * get all user
 * 
 * @return  user's list
 */
@ApiOperation("查询所有用户")
@ApiImplicitParam(name = "", value = "", required = false, dataType = "String")
@RequestMapping(value = "/selectAllUser", method = {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result getAllUser() {
	
	 List<UserDim> res=userService.getAllUser();
	 if(res.isEmpty()) {
		 return ResultUtil.success(ResultEnum.NO_RESULT);	 
	 }
	 return ResultUtil.success(res);

	
}


@ApiOperation("查询用户密码是否正确")
@ApiImplicitParam(name = "", value = "", required = false, dataType = "String")
@RequestMapping(value = "/checkPassword", method = {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result checkPassword(@RequestBody LoginInfo info) {
	String code=info.getUserCode();
	String pwd=info.getPassword();
	int flag=userService.checkPassword(code, pwd);
	if(flag==0) {
		return ResultUtil.error(0, "密码错误");
	}
	return ResultUtil.success(ResultEnum.SUCCESS);
	
	
}

@ApiOperation("修改用户密码")
@ApiImplicitParam(name = "", value = "", required = false, dataType = "String")
@RequestMapping(value = "/changePassword", method = {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result changPassword(@RequestParam String userCode, @RequestParam String password) {
	int flag=userService.changpwd(userCode, password);
	if(flag==2) {
		return ResultUtil.error(0, "用户名不存在");
	}
	return ResultUtil.success();
	
	
}

//增加userformInfo表单信息
@ApiOperation("增加userformInfo表单信息")
@ApiImplicitParam(name="addUserInfo",value="查询所有的组织信息记录",required=true,dataType="Object")
@RequestMapping(value="/addUserInfo",method= {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result addUserInfo(@RequestBody UserFormInfo info) {
	int res=userService.addUserInfo(info);
	return ResultUtil.success(res);
}

//查找userformInfo表单信息
@ApiOperation("增加userformInfo表单信息")
@ApiImplicitParam(name="findUserInfo",value="查询所有的组织信息记录",required=true,dataType="Object")
@RequestMapping(value="/findUserInfo",method= {RequestMethod.GET,RequestMethod.POST})
@ResponseBody
public Result findUserInfo() {
	List<UserFormInfo> res=userService.findUserInfo();
	return ResultUtil.success(res);
}


}
