package com.tianma.BI_Process.Domain;

import java.util.Date;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonFormat;

public class UserFormInfo {
    private Integer id;

    private String user_Code;

    private String user_Name;

    private String user_Password;

    private String dept;

    private String phone_Number;

    private String email;

    private Boolean invalid_Flag;

    private String oper_Sign;

    private String create_User;
    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_Date;
    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date record_Date;

    private Integer approval_Id;

    private String case_Title;

    private Integer case_Status;

    private String apply_Reason;
    
    private String menu_List;

    private JSONArray authority_List;
    
    private Integer case_Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_Code() {
        return user_Code;
    }

    public void setUser_Code(String user_Code) {
        this.user_Code = user_Code == null ? null : user_Code.trim();
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name == null ? null : user_Name.trim();
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password == null ? null : user_Password.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number == null ? null : phone_Number.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
        this.oper_Sign = oper_Sign == null ? null : oper_Sign.trim();
    }

    public String getCreate_User() {
        return create_User;
    }

    public void setCreate_User(String create_User) {
        this.create_User = create_User == null ? null : create_User.trim();
    }

    public Date getCreate_Date() {
        return create_Date;
    }

    public void setCreate_Date(Date create_Date) {
        this.create_Date = create_Date;
    }

    public Date getRecord_Date() {
        return record_Date;
    }

    public void setRecord_Date(Date record_Date) {
        this.record_Date = record_Date;
    }

    public Integer getApproval_Id() {
        return approval_Id;
    }

    public void setApproval_Id(Integer approval_Id) {
        this.approval_Id = approval_Id;
    }

    public String getCase_Title() {
        return case_Title;
    }

    public void setCase_Title(String case_Title) {
        this.case_Title = case_Title == null ? null : case_Title.trim();
    }

    public Integer getCase_Status() {
        return case_Status;
    }

    public void setCase_Status(Integer case_Status) {
        this.case_Status = case_Status;
    }

    public String getApply_Reason() {
        return apply_Reason;
    }

    public void setApply_Reason(String apply_Reason) {
        this.apply_Reason = apply_Reason == null ? null : apply_Reason.trim();
    }

	public String getMenu_List() {
		return menu_List;
	}

	public void setMenu_List(String menu_List) {
		this.menu_List = menu_List;
	}

	public JSONArray getAuthority_List() {
		return authority_List;
	}

	public void setAuthority_List(JSONArray authority_List) {
		this.authority_List = authority_List;
	}
	

	public Integer getCase_Id() {
		return case_Id;
	}

	public void setCase_Id(Integer case_Id) {
		this.case_Id = case_Id;
	}

	@Override
	public String toString() {
		return "UserFormInfo [id=" + id + ", user_Code=" + user_Code + ", user_Name=" + user_Name + ", user_Password="
				+ user_Password + ", dept=" + dept + ", phone_Number=" + phone_Number + ", email=" + email
				+ ", invalid_Flag=" + invalid_Flag + ", oper_Sign=" + oper_Sign + ", create_User=" + create_User
				+ ", create_Date=" + create_Date + ", record_Date=" + record_Date + ", approval_Id=" + approval_Id
				+ ", case_Title=" + case_Title + ", case_Status=" + case_Status + ", apply_Reason=" + apply_Reason
				+ ", menu_List=" + menu_List + ", authority_List=" + authority_List + ", case_Id=" + case_Id + "]";
	}
    
}