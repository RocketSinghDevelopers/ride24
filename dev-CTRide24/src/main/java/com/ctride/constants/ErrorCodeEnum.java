package com.ctride.constants;

public enum ErrorCodeEnum {
	ERROR_1000("error.1000"), //
	ERROR_1001("error.1001");//

	private String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	private ErrorCodeEnum(String errorCode) {
		this.errorCode = errorCode;
	}
}
