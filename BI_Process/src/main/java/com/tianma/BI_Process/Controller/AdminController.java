package com.tianma.BI_Process.Controller;

import java.awt.print.Printable;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.tianma.BI_Process.Domain.ApprovalCaseFact;
import com.tianma.BI_Process.Domain.ApprovalCaseRecordFact;
import com.tianma.BI_Process.Domain.ApprovalNodeDim;
import com.tianma.BI_Process.Domain.CategoryAdminDim;
import com.tianma.BI_Process.Domain.CategoryDim;
import com.tianma.BI_Process.Domain.CategoryInfo;
import com.tianma.BI_Process.Domain.OrgDim;
import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Dto.ApprovalInfo;
import com.tianma.BI_Process.Dto.ApprovalInformation;
import com.tianma.BI_Process.Dto.CategoryAndUser;
import com.tianma.BI_Process.Dto.UserFormInformation;
import com.tianma.BI_Process.Dto.categoryUpdate;
import com.tianma.BI_Process.Repository.UserFormInfoMapper;
import com.tianma.BI_Process.Service.ApprovalService;
import com.tianma.BI_Process.Service.CategoryService;
import com.tianma.BI_Process.Service.OrgService;
import com.tianma.BI_Process.Util.EncodeUtil;
import com.tianma.BI_Process.Util.JsonUtil;
import com.tianma.BI_Process.Util.Result;
import com.tianma.BI_Process.Util.ResultEnum;
import com.tianma.BI_Process.Util.ResultUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	@Autowired
	public OrgService orgService;
	@Autowired
	public ApprovalService appService;
	@Autowired
	public CategoryService cateService;
	@Autowired
	public UserFormInfoMapper userFormDao;

	// 增加一条组织信息
	@ApiOperation("增加一个组织信息")
	@ApiImplicitParam(name = "addOrgInformation", value = "组织信息", required = true, dataType = "OrgDim")
	@RequestMapping(value = "/addorg", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result addOrg(@RequestBody OrgDim orgDim) {
		int res = orgService.addOrg(orgDim);
		if (res == 1) {
			return ResultUtil.success();
		} else if (res == 0) {
			return ResultUtil.error(11, "组织名称重复，增加组织信息失败");
		}
		System.out.println("test");
		return ResultUtil.error(500, "服务器错误");
	}

//根据组织的code查询这一条组织记录
	@ApiOperation("根据组织的code查询这一条组织记录")
	@ApiImplicitParam(name = "findOrgByCode", value = "根据组织Code查询组织信息", required = true, dataType = "String")
	@RequestMapping(value = "/findorg", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findOrg(@RequestParam String orgcode) {
		List<OrgDim> res = orgService.findOrgByCode(orgcode);
		if (res.size() == 0) {
			return ResultUtil.success("该代码的组织不存在");
		}
		return ResultUtil.success(res.get(0));
	}

//查询所有的组织信息记录
	@ApiOperation("查询所有的组织信息记录")
	@ApiImplicitParam(name = "findAllOrgs", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/findAllorg", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findAllOrg() {
		List<OrgDim> res = orgService.findAllOrgs();
		if (res.size() == 0) {
			return ResultUtil.success("暂无任何组织信息");
		}
		return ResultUtil.success(res);
	}

//失效某个组织信息
	@ApiOperation("失效某个组织信息")
	@ApiImplicitParam(name = "id", value = "失效组织的ID值", required = true, dataType = "Integer")
	@RequestMapping(value = "/delorg", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result delOrg(@RequestParam Integer id) {

		int res = orgService.closeOrg(id);
		return ResultUtil.success(res);
	}

//生效某个组织信息
	@ApiOperation("生效某个组织信息")
	@ApiImplicitParam(name = "id", value = "生效组织的ID值", required = true, dataType = "Integer")
	@RequestMapping(value = "/openorg", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result openOrg(@RequestParam Integer id) {
		int res = orgService.openOrg(id);
		return ResultUtil.success(res);
	}

//根据组织ID查找该组织信息
	@ApiOperation("根据组织ID查找该组织信息")
	@ApiImplicitParam(name = "id", value = "查找组织的ID值", required = true, dataType = "Integer")
	@RequestMapping(value = "/findbyId", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findOrgById(@RequestParam Integer id) {
		OrgDim res = orgService.findOrgById(id);
		JSONObject jsonobject = JSONObject.fromObject(res);
		String jsonStr = jsonobject.toString();
		return ResultUtil.success(jsonStr);
	}

//更新一条组织信息
	@ApiOperation("更新一个组织信息")
	@ApiImplicitParam(name = "updateOrgInformation", value = "组织信息", required = true, dataType = "OrgDim")
	@RequestMapping(value = "/updateorg", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result updateOrg(@RequestBody OrgDim orgDim) {
		int res = orgService.updateOrg(orgDim);
		if (res == 1) {
			return ResultUtil.success();
		} else if (res == 0) {
			return ResultUtil.error(11, "组织名称重复，更新组织信息失败");
		}
		System.out.println("test");
		return ResultUtil.error(500, "服务器错误");
	}

//增加一个完整的审批流程信息
	@ApiOperation("增加一个完整的审批流程信息")
	@ApiImplicitParam(name = "approvalInfo", value = "流程信息", required = true, dataType = "ApprovalInfo")
	@RequestMapping(value = "/addApproval", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result addApproval(@RequestBody ApprovalInfo aInfo) {

		System.out.println(aInfo);
		int res = appService.addApproval(aInfo);
		if (res == -1) {
			return ResultUtil.error(201, "该审批流程已存在");
		} else if (res == 0) {
			return ResultUtil.error(202, "未知错误");
		}
		return ResultUtil.success();
	}

//根据审批流程的id得到其所有的流程节点信息
	@ApiOperation("根据审批流程的id得到其所有的流程节点信息")
	@ApiImplicitParam(name = "id", value = "流程id", required = true, dataType = "Integer")
	@RequestMapping(value = "/findNodesbyId", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findNodesById(@RequestParam Integer id) {

		List<ApprovalNodeDim> list = appService.getNodesByApprovalId(id);
		return ResultUtil.success(list);

	}

//增加一个流程实例
	@ApiOperation("根据填入的信息开启流程")
	@ApiImplicitParam(name = "case", value = "流程实例", required = true, dataType = "UserFormInfo")
	@RequestMapping(value = "/addcase", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result addCase(@RequestBody UserFormInfo userInfo) {
		System.out.println(userInfo);
		appService.addApprovalCase(userInfo);
		return ResultUtil.success();

	}

//获取所有的审批流信息
	@ApiOperation("获取所有的审批流信息")
	@RequestMapping(value = "/getallapp", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result getAllApproval() {

		List<ApprovalInfo> list = appService.getAllApproval();
		return ResultUtil.success(list);

	}

	// 判断哪些用户有需要审批的节点
	@ApiOperation("获取所有的审批流信息")
	@RequestMapping(value = "/getchecklist", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result getAllCheckApproval() {

		List<UserFormInfo> list = appService.getCheckList();
		System.out.println(appService.getCheckList());
		return ResultUtil.success(list);
	}

//根据用户工号有需要审批的节点
	@ApiOperation("获取所有的审批流信息")
	@RequestMapping(value = "/getInfos", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result getInfos(@RequestParam String userCode) {

		List<UserFormInfo> list = appService.theInfo(userCode);
		return ResultUtil.success(list);
	}

//根据id查询用户提交的申请信息
	@ApiOperation("根据id查询用户提交的申请信息")
	@RequestMapping(value = "/getInfo", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result getInfo(@RequestParam Integer id) {
		UserFormInfo info = appService.getFormInfo(id);
		return ResultUtil.success(info);
	}

//更新审批结果
	@ApiOperation("更新审批结果")
	@RequestMapping(value = "/postApproval", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result postApproval(@RequestBody ApprovalInformation result) {
		int res = appService.updateAppInfo(result);
		return ResultUtil.success();
	}

//用户名密码加密
	@ApiOperation("用户名密码加密")
	@RequestMapping(value = "/userLock", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result userLock(@RequestParam String username, @RequestParam String password) {

		String userCode = null;
		try {
			userCode = EncodeUtil.des3Encrypt3Base64(username);
			password = EncodeUtil.des3Encrypt3Base64(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res = "username:" + userCode + ";password:" + password;
		return ResultUtil.success(res);
	}

	/**
	 * 
	 * @author Administrator 1--成功 0--失败 -1--该信息已存在 2--该数据不存在
	 *
	 */
//增加类型设置表信息
	@ApiOperation("增加类型设置表信息")
	@RequestMapping(value = "/addCategory", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result addCategory(@RequestBody CategoryDim reDim) {

		try {
			int res = cateService.addCate(reDim);
			if (res == -1) {
				return ResultUtil.error(ResultEnum.ALREADY_EXIST);
			}
			return ResultUtil.success(ResultEnum.SUCCESS);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//根据类别编码查找对应类型
	@ApiOperation("根据类别编码查找对应类型")
	@RequestMapping(value = "/findDim", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findDim(@RequestParam String code) {
		try {
			List<CategoryDim> list = cateService.finDim(code);
			if (list.size() == 0) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}

			return ResultUtil.success(list.get(0));
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//更新类型信息
	@ApiOperation("更新类型信息")
	@RequestMapping(value = "/updateCateDim", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result updateCateDim(@RequestBody categoryUpdate update) {
		try {
			String code = update.getHistory_Code();
			CategoryDim reDim = cateService.finDim(code).get(0);
			reDim.setCategory_Code(update.getCategory_Code());
			reDim.setCategory_Name(update.getCategory_Name());
			reDim.setOper_Sign(update.getOper_Sign());
			reDim.setRecord_Date(update.getRecord_Date());
			int res = cateService.updateCate(reDim);
			if (res == -1) {
				return ResultUtil.success(ResultEnum.ALREADY_EXIST);
			} else if (res == 1) {
				List<CategoryAdminDim> list = cateService.finCateAdminByCate(code);
				if (list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						CategoryAdminDim adminDim = list.get(i);
						adminDim.setCategory_Code(update.getCategory_Code());
						adminDim.setOper_Sign(reDim.getOper_Sign());
						adminDim.setRecord_Date(reDim.getRecord_Date());
						cateService.updateAdminDim(adminDim);
					}
				}
				return ResultUtil.success(ResultEnum.SUCCESS);
			}
			return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//删除类型信息
	@ApiOperation("删除类型信息")
	@RequestMapping(value = "/deleteCateDim", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result deleteCateDim(@RequestParam String code) {
		try {
			int res = cateService.deleteCate(code);
			if (res == 1) {
				return ResultUtil.success(ResultEnum.SUCCESS);
			}
			return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//增加类型设置明细表数据信息
	@ApiOperation("增加类型设置明细表数据信息")
	@RequestMapping(value = "/addCateInfo", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result addCateInfo(@RequestBody CategoryInfo info) {
		try {
			int res = cateService.addCateInfo(info);
			if (res == -1) {
				return ResultUtil.success(ResultEnum.ALREADY_EXIST);
			} else if (res == 1) {
				return ResultUtil.success(ResultEnum.SUCCESS);
			}
			return ResultUtil.error(ResultEnum.UNKNOW_ERROR);

		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//根据code查询类型设置明细表数据信息
	@ApiOperation("根据code查询类型设置明细表数据信息")
	@RequestMapping(value = "/findCateInfo", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateInfo(@RequestParam String code) {
		try {
			List<CategoryInfo> list = cateService.finInfo(code);
			if (list.size() == 0) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			return ResultUtil.success(list);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//更新类型设置明细表信息
	@ApiOperation("更新类型设置明细表信息")
	@RequestMapping(value = "/updateCateInfo", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result updateCateInfo(@RequestBody categoryUpdate update) {
		try {
			String code = update.getHistory_Code();
			CategoryInfo reDim = cateService.finInfo(code).get(0);
			reDim.setParameter_Code(update.getParameter_Code());
			reDim.setParameter_Description(update.getParameter_Description());
			reDim.setParameter_Name(update.getParameter_Name());
			reDim.setOper_Sign(update.getOper_Sign());
			reDim.setRecord_Date(update.getRecord_Date());
			int res = cateService.updateCateInfo(reDim);
			if (res == -1) {
				return ResultUtil.success(ResultEnum.ALREADY_EXIST);
			} else if (res == 1) {
				List<CategoryAdminDim> list = cateService.finCateAdminByInfo(code);
				if (list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						CategoryAdminDim adminDim = list.get(i);
						adminDim.setParameter_Code(update.getParameter_Code());
						adminDim.setOper_Sign(reDim.getOper_Sign());
						adminDim.setRecord_Date(reDim.getRecord_Date());
						cateService.updateAdminDim(adminDim);
					}
				}
				return ResultUtil.success(ResultEnum.SUCCESS);
			}
			return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//删除类型设置明细表信息
	@ApiOperation("删除类型设置明细表信息")
	@RequestMapping(value = "/deleteCateInfo", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result deleteCateInfo(@RequestParam String code) {
		try {

			int res = cateService.deleteCateInfo(code);
			List<CategoryAdminDim> adminDims = cateService.finCateAdminByInfo(code);
			if (!adminDims.isEmpty()) {
				for (int i = 0; i < adminDims.size(); i++) {
					CategoryAdminDim rDim = adminDims.get(i);
					rDim.setInvalid_Flag(false);
					cateService.updateAdminDim(rDim);
				}
			}
			if (res == 1) {
				return ResultUtil.success(ResultEnum.SUCCESS);
			}
			return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//增加类型-管理员表数据信息
	@ApiOperation("增加类型-管理员表数据信息")
	@RequestMapping(value = "/addCateAdmin", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result addCateAdmin(@RequestBody CategoryAdminDim item) {
		try {
			int res = cateService.addCateAdmin(item);
			if (res == -1) {
				return ResultUtil.success(ResultEnum.ALREADY_EXIST);
			}
			return ResultUtil.success(ResultEnum.SUCCESS);

		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//根据类别和类型编码查询类型-Admin表数据信息
	@ApiOperation("根据类别和类型编码查询类型-Admin表数据信息")
	@RequestMapping(value = "/findCateAdmin", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdmin(@RequestParam String cateCode, @RequestParam String infoCode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminInfoByCateAndInfo(cateCode, infoCode);
			if (list.size() == 0) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			return ResultUtil.success(list);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//更新类型-Admin表信息
	@ApiOperation("更新类型-Admin表信息")
	@RequestMapping(value = "/updateCateAdmin", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result updateCateAdmin(@RequestBody CategoryAdminDim item) {
		try {
			int res = cateService.updateAdminDim(item);
			if (res == 1) {
				return ResultUtil.success(ResultEnum.SUCCESS);
			}
			return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//删除类型-Admin表信息
	@ApiOperation("删除类型-Admin表信息")
	@RequestMapping(value = "/deleteCateAdmin", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result deleteCateAdmin(@RequestBody CategoryAdminDim item) {
		try {
			int res = cateService.deleteAdminDim(item);
			if (res == 1) {
				return ResultUtil.success(ResultEnum.SUCCESS);
			}
			return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//根据管理员编码查询其管理的类别-参数-人员
	@ApiOperation("根据管理员编码查找其管理的类型信息")
	@RequestMapping(value = "/findCateAdminByUser", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdminByUser(@RequestParam String userCode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminInfoByUser(userCode);
			if (list.isEmpty()) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			List<CategoryAndUser> results = cateService.findByUser(userCode);
			return ResultUtil.success(results);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

	// .根据参数类型查询其管理的类别-参数-人员
	@ApiOperation("根据参数类型编码查找其管理的类型信息")
	@RequestMapping(value = "/findCateAdminByParam", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdminByParameter(@RequestParam String parameterCode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminByInfo(parameterCode);
			if (list.isEmpty()) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			List<CategoryAndUser> results = cateService.findByParamCode(parameterCode);
			return ResultUtil.success(results);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//.根据类别编码查询其管理的类别-参数-人员
	@ApiOperation("根据类别编码查找其管理的类型信息")
	@RequestMapping(value = "/findCateAdminByCate", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdminByCate(@RequestParam String categoryCode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminByCate(categoryCode);
			if (list.isEmpty()) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			List<CategoryAndUser> results = cateService.findByCate(categoryCode);
			return ResultUtil.success(results);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//.根据类别编码+类型编码+管理员编码查找其管理的类型信息
	@ApiOperation(" 根据类别编码+类型编码+管理员编码查找其管理的类型信息")
	@RequestMapping(value = "/findCateAdminByCode", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdminByCode(@RequestParam String catecode, @RequestParam String infocode,
			@RequestParam String usercode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminInfoByCode(catecode, infocode, usercode);
			if (list.isEmpty()) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			return ResultUtil.success(list);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//.根据类别编码其管理的类型信息
	@ApiOperation(" 根据类别编码查找其管理的类型信息")
	@RequestMapping(value = "/findCateAdminByCategoryCode", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdminByCategoryCode(@RequestParam String catecode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminByCate(catecode);
			if (list.isEmpty()) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			return ResultUtil.success(list);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//.根据类型明细编码查找其管理的类型信息
	@ApiOperation(" 根据类型明细编码查找其管理的类型信息")
	@RequestMapping(value = "/findCateAdminByParameterCode", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdminByParameterCode(@RequestParam String infocode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminByInfo(infocode);
			if (list.isEmpty()) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			return ResultUtil.success(list);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//.根据人员编码查找其管理的类型信息
	@ApiOperation(" 根据人员编码查找其管理的类型信息")
	@RequestMapping(value = "/findCateAdminByUserCode", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findCateAdminByUserCode(@RequestParam String usercode) {
		try {
			List<CategoryAdminDim> list = cateService.finCateAdminInfoByUser(usercode);
			if (list.isEmpty()) {
				return ResultUtil.success(ResultEnum.NO_RESULT);
			}
			return ResultUtil.success(list);
		} catch (Exception e) {
			// TODO: handle exception
			return ResultUtil.error(e, ResultEnum.SYSTEM_ERROR);
		}
	}

//查询所有的类别信息
	@ApiOperation("查询所有的类别信息")
	@ApiImplicitParam(name = "findAllCategories", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/findAllCategories", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findAllCategories() {
		List<CategoryDim> res = cateService.getAllCategoryDims();
		if (res.size() == 0) {
			return ResultUtil.success(ResultEnum.NO_RESULT);
		}
		return ResultUtil.success(res);
	}

//查询所有的类别属性信息
	@ApiOperation("查询所有的类别属性信息")
	@ApiImplicitParam(name = "findAllParameters", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/findAllParameters", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findAllParameters() {
		List<CategoryInfo> res = cateService.getAllCategoryInfos();
		if (res.size() == 0) {
			return ResultUtil.success(ResultEnum.NO_RESULT);
		}
		return ResultUtil.success(res);
	}

//查询所有的类型-Admin信息
	@ApiOperation("查询所有的类型-Admin信息")
	@ApiImplicitParam(name = "findAllCateAdmins", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/findAllCateAdmins", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findAllCateAdmins() {
		List<CategoryAdminDim> res = cateService.getAllCategoryAdminDims();
		if (res.size() == 0) {
			return ResultUtil.success(ResultEnum.NO_RESULT);
		}
		return ResultUtil.success(res);
	}

//查询所有的类别-参数-人员信息
	@ApiOperation("查询所有的类别-参数-人员信息")
	@ApiImplicitParam(name = "findAllCateAndUsers", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/findAllCateAndUsers", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findAllCateAndUsers() {
		List<CategoryAndUser> res = cateService.getAllCategoryAndUsers();
		if (res.size() == 0) {
			return ResultUtil.success(ResultEnum.NO_RESULT);
		}
		return ResultUtil.success(res);
	}

//根据case_id查询其所有的审批值
	@ApiOperation("根据case_id查询其所有的审批值")
	@ApiImplicitParam(name = "findRecordsByCaseId", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/findRecords", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findRecordsByCaseId(@RequestParam Integer caseId) {
		List<ApprovalCaseRecordFact> res = appService.getCaseRecordsByCaseID(caseId);
		if (res.size() == 0) {
			return ResultUtil.success(ResultEnum.NO_RESULT);
		}
		return ResultUtil.success(res);
	}

//根据用户的工号和创建时间在userformInfo中查找信息
	@ApiOperation("根据用户的工号和创建时间在userformInfo中查找信息")
	@ApiImplicitParam(name = "findUserformInfo", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/findUserformInfo", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result findUserformInfo(@RequestBody UserFormInfo info) {
		List<UserFormInfo> user = userFormDao.selectByCodeAndTime(info);
		UserFormInfo userInfo = userFormDao.selectByCodeAndTime(info).get(0);
		return ResultUtil.success(userInfo);
	}

//批量更新用户的权限信息
	@ApiOperation("批量更新用户的权限信息")
	@ApiImplicitParam(name = "updateCateAdmin", value = "查询所有的组织信息记录", required = true, dataType = "Object")
	@RequestMapping(value = "/updateCateAdmins", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Result updateCateAdmins(@RequestBody CategoryAndUser info) {
		List<CategoryAndUser> informations = JsonUtil.jsonToList(info.getCateArray().toString(), CategoryAndUser.class);
		String code = informations.get(0).getUser_Code();
		Date dateTime=informations.get(0).getCreate_Date();
		String username=informations.get(0).getCreate_User();
		List<CategoryAdminDim> list = cateService.finAllCateAdminInfoByUser(code);
		List<CategoryAdminDim>  users=list;
        
		
		if (!list.isEmpty()) {
			for(CategoryAndUser item:informations ) {
				list=list.stream().filter(x->!(item.getUser_Code().equals(x.getAdmin_Code())&&
						item.getCategory_Code().equals(x.getCategory_Code())&&
						item.getParameter_Code().equals(x.getParameter_Code()))).collect(Collectors.toList());
			}
	 		
			for(CategoryAdminDim item:users) {
				informations=informations.stream().filter(x->!(item.getAdmin_Code().equals(x.getUser_Code())&&
						item.getCategory_Code().equals(x.getCategory_Code())&&
						item.getParameter_Code().equals(x.getParameter_Code()))).collect(Collectors.toList());
			}
			users.removeAll(list);
	       for(CategoryAdminDim item:list) {
	    	  if(item.getInvalid_Flag()==true) {
	    		  item.setInvalid_Flag(false);
		    	   item.setOper_Sign(username);
		    	   item.setRecord_Date(dateTime);
		    	   cateService.updateAdminDim(item);
	    	  }
	       }
	       for(CategoryAdminDim item:users) {
	    	   if(item.getInvalid_Flag()==false) {
	    		   item.setInvalid_Flag(true);
		    	   item.setOper_Sign(username);
		    	   item.setRecord_Date(dateTime);
		    	   cateService.updateAdminDim(item);
	    	   }
	       }
	       
		}
		for (int i = 0; i < informations.size(); i++) {
			CategoryAdminDim adminDim = new CategoryAdminDim();
			CategoryAndUser info3 = informations.get(i);
			adminDim.setAdmin_Code(info3.getUser_Code());
			adminDim.setCategory_Code(info3.getCategory_Code());
			adminDim.setParameter_Code(info3.getParameter_Code());
			adminDim.setCreate_Date(info3.getCreate_Date());
			adminDim.setCreate_User(info3.getCreate_User());
			cateService.addCateAdmin(adminDim);
		}

		return ResultUtil.success(users);
	}

}
