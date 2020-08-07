package com.tianma.BI_Process.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class categoryUpdate {
	private String category_Code;

    private String category_Name;
    
    private String parameter_Code;

    private String parameter_Name;

    private String parameter_Description;

    private String oper_Sign;
    @JsonFormat(locale ="zh",pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date record_Date;
     
    private String history_Code;

	public String getCategory_Code() {
		return category_Code;
	}

	public void setCategory_Code(String category_Code) {
		this.category_Code = category_Code;
	}

	public String getCategory_Name() {
		return category_Name;
	}

	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}

	public String getParameter_Code() {
		return parameter_Code;
	}

	public void setParameter_Code(String parameter_Code) {
		this.parameter_Code = parameter_Code;
	}

	public String getParameter_Name() {
		return parameter_Name;
	}

	public void setParameter_Name(String parameter_Name) {
		this.parameter_Name = parameter_Name;
	}

	public String getParameter_Description() {
		return parameter_Description;
	}

	public void setParameter_Description(String parameter_Description) {
		this.parameter_Description = parameter_Description;
	}

	public String getOper_Sign() {
		return oper_Sign;
	}

	public void setOper_Sign(String oper_Sign) {
		this.oper_Sign = oper_Sign;
	}

	public Date getRecord_Date() {
		return record_Date;
	}

	public void setRecord_Date(Date record_Date) {
		this.record_Date = record_Date;
	}

	public String getHistory_Code() {
		return history_Code;
	}

	public void setHistory_Code(String history_Code) {
		this.history_Code = history_Code;
	}
    
    
 


}

