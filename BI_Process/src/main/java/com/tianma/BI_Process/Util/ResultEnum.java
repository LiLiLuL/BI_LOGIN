package com.tianma.BI_Process.Util;

public enum ResultEnum {
	UNKNOW_ERROR(-1,"未知错误"),
	SUCCESS(1,"成功"),
    WORKFLOW_EXISTS(101,"此流程名称已存在"),
	USER_EXISTS(301,"此用户不存在"),
	COMMENT_NULL(203,"此文章暂无评论"),
	ALREADY_EXIST(2,"该信息已存在"),
	NO_RESULT(-1,"查询信息不存在"),
	SYSTEM_ERROR(-2,"系统错误")
	;
	private  Integer code;
	private  String msg;
		
   ResultEnum(Integer code,String msg) {
		// TODO Auto-generated constructor stub
	   this.code=code;
	   this.msg=msg;
	}



    public Integer getCode() {
      	return code;
    }



    public void setCode(Integer code) {
	   this.code = code;
    }



   public String getMsg() {
	    return msg;
    }



     public void setMsg(String msg) {
	    this.msg = msg;
      }
 
	
	

}
