package com.tianma.BI_Process.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tianma.BI_Process.Domain.ApprovalNodeDim;

public class ApprovalInfo {
	  private Integer id;
	  private String approval_Name;
	  private String create_User;
	  private String modify_User;
	  private ApprovalNodeDim nodeArr[];
	  @JsonFormat(shape = JsonFormat.Shape.STRING, locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	  private Date create_Date;
	  @JsonFormat(shape = JsonFormat.Shape.STRING, locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	  private Date record_Date;
	  private String nodeDept;
	  private String operation_user;
	  private String operation_result;
	  private String operation_reason;
	  
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
		this.approval_Name = approval_Name;
	}
	public ApprovalNodeDim[] getNodeArr() {
		return nodeArr;
	}
	public void setNodeArr(ApprovalNodeDim[] nodeArr) {
		this.nodeArr = nodeArr;
	}
	public String getCreate_User() {
		return create_User;
	}
	public void setCreate_User(String create_User) {
		this.create_User = create_User;
	}
	public String getModify_User() {
		return modify_User;
	}
	public void setModify_User(String modify_User) {
		this.modify_User = modify_User;
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
	public String getNodeDept() {
		return nodeDept;
	}
	public void setNodeDept(String nodeDept) {
		this.nodeDept = nodeDept;
	}
	public String getOperation_user() {
		return operation_user;
	}
	public void setOperation_user(String operation_user) {
		this.operation_user = operation_user;
	}
	public String getOperation_result() {
		return operation_result;
	}
	public void setOperation_result(String operation_result) {
		this.operation_result = operation_result;
	}
	public String getOperation_reason() {
		return operation_reason;
	}
	public void setOperation_reason(String operation_reason) {
		this.operation_reason = operation_reason;
	}
	
	
	  

}
