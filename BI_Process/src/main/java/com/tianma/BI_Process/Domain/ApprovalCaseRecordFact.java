package com.tianma.BI_Process.Domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApprovalCaseRecordFact {
    private Integer id;

    private String modify_user;

    private String create_user;
    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_Date;
    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date record_Date;

    private Integer case_Id;

    private Integer currenty_Node_Id;

    private Integer opration_user;

    private Integer opration_result;

    private String opration_reason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCase_Id() {
        return case_Id;
    }

    public void setCase_Id(Integer case_Id) {
        this.case_Id = case_Id;
    }

    public Integer getCurrenty_Node_Id() {
        return currenty_Node_Id;
    }

    public void setCurrenty_Node_Id(Integer currenty_Node_Id) {
        this.currenty_Node_Id = currenty_Node_Id;
    }

    public Integer getOpration_user() {
        return opration_user;
    }

    public void setOpration_user(Integer opration_user) {
        this.opration_user = opration_user;
    }

    public Integer getOpration_result() {
        return opration_result;
    }

    public void setOpration_result(Integer opration_result) {
        this.opration_result = opration_result;
    }

    public String getOpration_reason() {
        return opration_reason;
    }
 
    public void setOpration_reason(String opration_reason) {
        this.opration_reason = opration_reason == null ? null : opration_reason.trim();
    }
}