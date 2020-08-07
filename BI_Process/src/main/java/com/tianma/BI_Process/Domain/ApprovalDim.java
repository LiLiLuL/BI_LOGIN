package com.tianma.BI_Process.Domain;

import java.util.Date;

public class ApprovalDim {
    private Integer id;

    private String approval_Name;

    private String create_User;

    private String modify_user;

    private Date create_Date;

    private Date record_Date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApproval_Name() {
        return approval_Name;
    }

    public void setApproval_Name(String approval_Name) {
        this.approval_Name = approval_Name == null ? null : approval_Name.trim();
    }

    public String getCreate_User() {
        return create_User;
    }

    public void setCreate_User(String create_User) {
        this.create_User = create_User == null ? null : create_User.trim();
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user == null ? null : modify_user.trim();
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