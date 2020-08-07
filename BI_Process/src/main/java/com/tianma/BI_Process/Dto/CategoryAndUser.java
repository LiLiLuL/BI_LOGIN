package com.tianma.BI_Process.Dto;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonFormat;

public class CategoryAndUser {
	
	   private String category_Code;

	    private String category_Name;
	    
	    private String parameter_Code;

	    private String parameter_Name;

	    private String parameter_Description;

	    private String create_User;
	    
	    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	    private Date create_Date;

	    private Boolean invalid_Flag;

	    private String oper_Sign;
	    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	    private Date record_Date;
	    
	    private String user_Code;

	    private String user_Name;

	    private String dept;

	    private String phone_Number;

	    private String email;
	    
	    private JSONArray cateArray;
	    
	    private String admin_Code;

		public String getCategory_Code() {
			return category_Code;
		}

		public void setCategory_Code(String category_Code) {
			this.category_Code = category_Code;
		}

		public String getCategory_Name() {
			return category_Name;
		}

		public void setCategory_Name(String category_Name) {
			this.category_Name = category_Name;
		}

		public String getParameter_Code() {
			return parameter_Code;
		}

		public void setParameter_Code(String parameter_Code) {
			this.parameter_Code = parameter_Code;
		}

		public String getParameter_Name() {
			return parameter_Name;
		}

		public void setParameter_Name(String parameter_Name) {
			this.parameter_Name = parameter_Name;
		}

		public String getParameter_Description() {
			return parameter_Description;
		}

		public void setParameter_Description(String parameter_Description) {
			this.parameter_Description = parameter_Description;
		}

		public String getCreate_User() {
			return create_User;
		}

		public void setCreate_User(String create_User) {
			this.create_User = create_User;
		}

		public Date getCreate_Date() {
			return create_Date;
		}

		public void setCreate_Date(Date create_Date) {
			this.create_Date = create_Date;
		}

		public Boolean getInvalid_Flag() {
			return invalid_Flag;
		}

		public void setInvalid_Flag(Boolean invalid_Flag) {
			this.invalid_Flag = invalid_Flag;
		}

		public String getOper_Sign() {
			return oper_Sign;
		}

		public void setOper_Sign(String oper_Sign) {
			this.oper_Sign = oper_Sign;
		}

		public Date getRecord_Date() {
			return record_Date;
		}

		public void setRecord_Date(Date record_Date) {
			this.record_Date = record_Date;
		}

		public String getUser_Code() {
			return user_Code;
		}

		public void setUser_Code(String user_Code) {
			this.user_Code = user_Code;
		}

		public String getUser_Name() {
			return user_Name;
		}

		public void setUser_Name(String user_Name) {
			this.user_Name = user_Name;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getPhone_Number() {
			return phone_Number;
		}

		public void setPhone_Number(String phone_Number) {
			this.phone_Number = phone_Number;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public JSONArray getCateArray() {
			return cateArray;
		}

		public void setCateArray(JSONArray cateArray) {
			this.cateArray = cateArray;
		}

		public String getAdmin_Code() {
			return admin_Code;
		}

		public void setAdmin_Code(String admin_Code) {
			this.admin_Code = admin_Code;
		}
		
	    
	    
}
