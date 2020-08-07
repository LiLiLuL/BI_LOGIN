package com.tianma.BI_Process.Service;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Service;

import com.tianma.BI_Process.Domain.UserDim;
import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Util.Result;

@Service
public interface UserService {

//add user	
public int addUser(UserDim userDim);

//delete user
public int deleteUser(UserDim userDim);

//change user
public int changeUser(UserDim userDim);

//get user by user_code 
public Result getUserByCode(String userCode);

//get all user
public List<UserDim> getAllUser();

public int checkPassword(String code,String pwd);

public int changpwd(String code,String pwd);

//向user_form_info表中插入数组
public int addUserInfo(UserFormInfo info);
//查找user_form_info表单信息
public List<UserFormInfo> findUserInfo();



}
