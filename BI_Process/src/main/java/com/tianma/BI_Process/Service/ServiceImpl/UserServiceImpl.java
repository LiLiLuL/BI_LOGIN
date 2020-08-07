package com.tianma.BI_Process.Service.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.ApprovalCaseFactExample.Criteria;
import com.tianma.BI_Process.Domain.UserDim;
import com.tianma.BI_Process.Domain.UserDimExample;
import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Domain.UserFormInfoExample;
import com.tianma.BI_Process.Repository.UserDimMapper;
import com.tianma.BI_Process.Repository.UserFormInfoMapper;
import com.tianma.BI_Process.Service.UserService;
import com.tianma.BI_Process.Util.MD5;
import com.tianma.BI_Process.Util.Result;
import com.tianma.BI_Process.Util.ResultUtil;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDimMapper userdao;
	@Autowired
	UserFormInfoMapper infoDao;
	
	
	
	
	
	/***
	 * add user
	 * return   1：success    0：failure   2:user code duplicate
	 */
	@Override
	public int addUser(UserDim userDim) {
		// TODO Auto-generated method stub
		try {		
			//change the password to MD5 password
			MD5 md5 = new MD5();
			String pwMd5 = md5.md5("Tm!12345");
			userDim.setUser_Password(pwMd5);
			
			//insert the user
			userdao.insertSelective(userDim);
			return 1;
		} catch (DuplicateKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//user code duplicated
			return 2;
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	}

	
	/***
	 * delete user，set user's Invalid_Flag : false，make user invalid
	 * return  1：success    0：failure
	 */
	@Override
	public int deleteUser(UserDim userDim) {
		// TODO Auto-generated method stub
		try {
			//set user's Invalid_Flag : false，make user invalid
			userDim.setInvalid_Flag(false);
			userdao.updateByPrimaryKeySelective(userDim);
			
			return 1;
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	}

	
	/***
	 * changeUser
	 * return  1：success    0：failure
	 */
	@Override
	public int changeUser(UserDim userDim) {
		// TODO Auto-generated method stub
		try {
			
			//change the password to MD5 password
			MD5 md5 = new MD5();
			String pwMd5 = md5.md5(userDim.getUser_Password());
			userDim.setUser_Password(pwMd5);
			//
			userdao.updateByPrimaryKeySelective(userDim);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	
	
	/***
	 * get user by user code
	 * return 1：success    0：failure
	 */
	@Override
	public Result getUserByCode(String userCode) {
		// TODO Auto-generated method stub
		
		//create the select example
		//use example to select the user
		List<UserDim> userlist;
		try {
			UserDimExample example=new UserDimExample();
			example.or().andUser_CodeEqualTo(userCode);
			
			userlist = userdao.selectByExample(example);
			if(userlist.size()==0) {
				return ResultUtil.error(0, "查询失败！");
			}
			 return ResultUtil.success(userlist, "查询成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultUtil.error(0, "查询失败！");
		}
		
	}


	/***
	 * get all user
	 * return  1:success    0:failure
	 */
	@Override
	public List<UserDim> getAllUser() {
		// TODO Auto-generated method stub
		
		UserDimExample example = new UserDimExample();
		example.or().andInvalid_FlagEqualTo(true);
		
		List<UserDim> list=userdao.selectByExample(example);
		return list;
	
	}
	//判断密码是否正确
	public int checkPassword(String code,String pwd) {
		
		UserDimExample example=new UserDimExample();
		example.or().andUser_CodeEqualTo(code);
		
		UserDim userDim=userdao.selectByExample(example).get(0);
		MD5 md5 = new MD5();		
		String pwMd5 = md5.md5(pwd);
		if(pwMd5.equals(userDim.getUser_Password())) {
			return 1;
		}
		return 0;
	}

	//修改密码
	public int changpwd(String code,String pwd) {
		UserDimExample example=new UserDimExample();
		example.or().andUser_CodeEqualTo(code);
		List<UserDim>list=userdao.selectByExample(example);
		if(list.size()==0) {
			return 2; //用户不存在
		}
		UserDim userDim=list.get(0);
		MD5 md5 = new MD5();
		userDim.setUser_Password(md5.md5(pwd));
		userdao.updateByPrimaryKeySelective(userDim);
		return 1;
		
	
		
	}
	
	//向user_form_info表中插入数组
	public int addUserInfo(UserFormInfo info) {
		 infoDao.insertSelective(info);
		 return 1;
	}
	//查找user_form_info表单信息
	public List<UserFormInfo> findUserInfo(){
		UserFormInfoExample example=new UserFormInfoExample();
		List<UserFormInfo> list=infoDao.selectByExample(null);
		return list;
	}
	
}
