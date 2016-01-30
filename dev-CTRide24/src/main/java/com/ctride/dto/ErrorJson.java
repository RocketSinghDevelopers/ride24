package com.ctride.dto;

import java.util.Map;

public class ErrorJson {
	public Integer status;
	public String error;
	public String message;
	public String timeStamp;
	public String trace;

	public ErrorJson(int status, Map<String, String> errorAttributes) {
		this.status = status;
		this.error = (String) errorAttributes.get("error");
		this.message = (String) errorAttributes.get("message");
	}
}
