package com.tianma.BI_Process.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApprovalInformation {
	   private Integer approval_result;
	    
	   
	    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	    private Date approval_Date;

	    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	    private Date create_Date;
	    
	    private String approval_Msg;
	    
	    private String create_User_Code;
	    
	    private String approval_User;
	    
	    private String user_Name;
	    
	    private String dept;

	    private String phone_Number;

	    private String email;
	    
	    private Integer case_Id;

		public Integer getApproval_result() {
			return approval_result;
		}
		

		public void setApproval_result(Integer approval_result) {
			this.approval_result = approval_result;
		}

		public Date getApproval_Date() {
			return approval_Date;
		}

		public void setApproval_Date(Date approval_Date) {
			this.approval_Date = approval_Date;
		}

		public String getApproval_Msg() {
			return approval_Msg;
		}

		public void setApproval_Msg(String approval_Msg) {
			this.approval_Msg = approval_Msg;
		}


		public String getCreate_User_Code() {
			return create_User_Code;
		}


		public void setCreate_User_Code(String create_User_Code) {
			this.create_User_Code = create_User_Code;
		}


		public Date getCreate_Date() {
			return create_Date;
		}


		public void setCreate_Date(Date create_Date) {
			this.create_Date = create_Date;
		}


		public String getApproval_User() {
			return approval_User;
		}


		public void setApproval_User(String approval_User) {
			this.approval_User = approval_User;
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


		public Integer getCase_Id() {
			return case_Id;
		}


		public void setCase_Id(Integer case_Id) {
			this.case_Id = case_Id;
		}
	    
       
	 
	    

		
		}
	    
	    
	 
	


