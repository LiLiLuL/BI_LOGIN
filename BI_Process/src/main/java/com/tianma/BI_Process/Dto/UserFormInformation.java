package com.tianma.BI_Process.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserFormInformation {
	    private String create_User;

	    private Integer approval_Id;
	    
	    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	    private Date create_Date;

	    private String user_Code;

	    private String user_Name;

	    private String phone_Number;

	    private String email;

	    private String case_Title;

	    private Integer case_Status;
	    

		public String getCreate_User() {
			return create_User;
		}

		public void setCreate_User(String create_User) {
			this.create_User = create_User;
		}

		public Integer getApproval_Id() {
			return approval_Id;
		}

		public void setApproval_Id(Integer approval_Id) {
			this.approval_Id = approval_Id;
		}

		public Date getCreate_Date() {
			return create_Date;
		}

		public void setCreate_Date(Date create_Date) {
			this.create_Date = create_Date;
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

		public String getCase_Title() {
			return case_Title;
		}

		public void setCase_Title(String case_Title) {
			this.case_Title = case_Title;
		}

		public Integer getCase_Status() {
			return case_Status;
		}

		public void setCase_Status(Integer case_Status) {
			this.case_Status = case_Status;
		}
	    
	    
	 
	

}
