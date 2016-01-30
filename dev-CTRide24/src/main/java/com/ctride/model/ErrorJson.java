package com.ctride.model;

import java.util.Calendar;
import java.util.Date;

public class ErrorJson {
	public String errorCode;
	public String errorType;
	public String message;
	public Date timeStamp;

	public ErrorJson(String errorType, String errorCode) {
		this.errorCode = errorCode;
		this.errorType = errorType;
		this.message = resolveErrorCode(errorCode);
		this.timeStamp = Calendar.getInstance().getTime();
	}

	public static String resolveErrorCode(String errorCode) {
		return null;
	}
}
