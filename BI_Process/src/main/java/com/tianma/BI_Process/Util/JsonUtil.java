package com.tianma.BI_Process.Util;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;





public class JsonUtil {
	// 将jsonArray字符串转换成List集合
			public static List jsonToList(String json, Class beanClass) {
				if (!StringUtils.isBlank(json)) {
					//这里的JSONObject引入的是 com.alibaba.fastjson.JSONObject;
					return JSONObject.parseArray(json, beanClass);
				} else {
					return null;
				}
			}



}
