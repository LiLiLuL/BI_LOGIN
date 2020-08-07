package com.tianma.BI_Process.Domain;

import java.util.Date;

public class ApprovalNodeDim {
    private Integer id;

    private Integer approval_Id;

    private String modify_User;

    private String create_User;

    private Date create_Date;

    private Date record_Date;

    private Integer node_Type;

    private String conditions;

    private Integer prev_Node;

    private Integer next_Node;

    private String description;

    private String oper_Sign;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApproval_Id() {
        return approval_Id;
    }

    public void setApproval_Id(Integer approval_Id) {
        this.approval_Id = approval_Id;
    }

    public String getModify_User() {
        return modify_User;
    }

    public void setModify_User(String modify_User) {
        this.modify_User = modify_User == null ? null : modify_User.trim();
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

    public Integer getNode_Type() {
        return node_Type;
    }

    public void setNode_Type(Integer node_Type) {
        this.node_Type = node_Type;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions == null ? null : conditions.trim();
    }

    public Integer getPrev_Node() {
        return prev_Node;
    }

    public void setPrev_Node(Integer prev_Node) {
        this.prev_Node = prev_Node;
    }

    public Integer getNext_Node() {
        return next_Node;
    }

    public void setNext_Node(Integer next_Node) {
        this.next_Node = next_Node;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOper_Sign() {
        return oper_Sign;
    }

    public void setOper_Sign(String oper_Sign) {
        this.oper_Sign = oper_Sign == null ? null : oper_Sign.trim();
    }
}