package com.tianma.BI_Process.Domain;

import java.util.Date;

public class MenuDim {
    private Integer id;

    private Integer type_Flag;

    private String menu_Code;

    private String menu_Name;

    private String parent_Menu_Code;

    private Boolean invalid_Flag;

    private String oper_Sign;

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

    public String getMenu_Code() {
        return menu_Code;
    }

    public void setMenu_Code(String menu_Code) {
        this.menu_Code = menu_Code == null ? null : menu_Code.trim();
    }

    public String getMenu_Name() {
        return menu_Name;
    }

    public void setMenu_Name(String menu_Name) {
        this.menu_Name = menu_Name == null ? null : menu_Name.trim();
    }

    public String getParent_Menu_Code() {
        return parent_Menu_Code;
    }

    public void setParent_Menu_Code(String parent_Menu_Code) {
        this.parent_Menu_Code = parent_Menu_Code == null ? null : parent_Menu_Code.trim();
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
}