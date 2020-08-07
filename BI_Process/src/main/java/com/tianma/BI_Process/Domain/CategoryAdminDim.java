package com.tianma.BI_Process.Domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CategoryAdminDim {
    private Integer id;

    private String category_Code;

    private String parameter_Code;

    private String admin_Code;

    private String create_User;
    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_Date;

    private Boolean invalid_Flag;

    private String oper_Sign;
    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date record_Date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory_Code() {
        return category_Code;
    }

    public void setCategory_Code(String category_Code) {
        this.category_Code = category_Code == null ? null : category_Code.trim();
    }

    public String getParameter_Code() {
        return parameter_Code;
    }

    public void setParameter_Code(String parameter_Code) {
        this.parameter_Code = parameter_Code == null ? null : parameter_Code.trim();
    }

    public String getAdmin_Code() {
        return admin_Code;
    }

    public void setAdmin_Code(String admin_Code) {
        this.admin_Code = admin_Code == null ? null : admin_Code.trim();
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

    public Date getRecord_Date() {
        return record_Date;
    }

    public void setRecord_Date(Date record_Date) {
        this.record_Date = record_Date;
    }

	@Override
	public String toString() {
		return "CategoryAdminDim [id=" + id + ", category_Code=" + category_Code + ", parameter_Code=" + parameter_Code
				+ ", admin_Code=" + admin_Code + ", create_User=" + create_User + ", create_Date=" + create_Date
				+ ", invalid_Flag=" + invalid_Flag + ", oper_Sign=" + oper_Sign + ", record_Date=" + record_Date + "]";
	}
    
    
}