package com.zjw.chapter1.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {

	
	
	public static final Map<String,Object> error(){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("retCode",ResponseCode.ERROR_CODE);
		result.put("retInfo", "内部错误");
		return result;
	}
	
	
	public static final <T> Map<String,Object> success(final T t){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("retCode",ResponseCode.SUCCESS_CODE);
		result.put("retInfo", "成功");
		result.put("retResult", t);
		return result;
	}
}
