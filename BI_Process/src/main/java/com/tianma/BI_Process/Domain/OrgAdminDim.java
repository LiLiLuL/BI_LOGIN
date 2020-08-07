package com.tianma.BI_Process.Domain;

import java.util.Date;

public class OrgAdminDim {
    private Integer id;

    private Integer type_Flag;

    private String org_Code;

    private String admin_Code;

    private Boolean invalid_Flag;

    private String oper_Sign;

    private Date create_Date;

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

    public String getAdmin_Code() {
        return admin_Code;
    }

    public void setAdmin_Code(String admin_Code) {
        this.admin_Code = admin_Code == null ? null : admin_Code.trim();
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