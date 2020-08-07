package com.tianma.BI_Process.Domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrgDim {
    private Integer id;

    private Integer type_Flag;

    private String org_Code;

    private String org_Name;

    private String parent_Department;

    private String level_Flag;

    private Boolean invalid_Flag;

    private String modify_user;

    private String create_user;
    @JsonFormat(shape = JsonFormat.Shape.STRING, locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_Date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date record_Date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType_Flag() {
        return type_Flag;
    }

    public void setType_Flag(Integer type_Flag) {
        this.type_Flag = type_Flag;
    }

    public String getOrg_Code() {
        return org_Code;
    }

    public void setOrg_Code(String org_Code) {
        this.org_Code = org_Code == null ? null : org_Code.trim();
    }

    public String getOrg_Name() {
        return org_Name;
    }

    public void setOrg_Name(String org_Name) {
        this.org_Name = org_Name == null ? null : org_Name.trim();
    }

    public String getParent_Department() {
        return parent_Department;
    }

    public void setParent_Department(String parent_Department) {
        this.parent_Department = parent_Department == null ? null : parent_Department.trim();
    }

    public String getLevel_Flag() {
        return level_Flag;
    }

    public void setLevel_Flag(String level_Flag) {
        this.level_Flag = level_Flag == null ? null : level_Flag.trim();
    }

    public Boolean getInvalid_Flag() {
        return invalid_Flag;
    }

    public void setInvalid_Flag(Boolean invalid_Flag) {
        this.invalid_Flag = invalid_Flag;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user == null ? null : modify_user.trim();
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user == null ? null : create_user.trim();
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
}