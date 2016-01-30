package com.ctride.exception;

import java.util.List;

import com.ctride.model.ErrorJson;

public class ValidationException extends BaseException {

	private List<ErrorJson> errorList;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidationException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

	public ValidationException(String errorCode) {
		super(errorCode);
	}

	public ValidationException(String errorCode, List<ErrorJson> errorList) {
		super(errorCode);
		this.errorList = errorList;
	}

	public List<ErrorJson> getErrorList() {
		return errorList;
	}

}
