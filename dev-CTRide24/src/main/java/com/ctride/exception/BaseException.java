package com.ctride.exception;

import org.apache.commons.lang3.StringUtils;

public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Specific error code of this exception.
	 */
	private final String errorCode;

	/**
	 * Specific error message of this exception.
	 */
	private final String errorMessage;

	public BaseException(Exception exception) {
		super(exception);
		this.errorCode = exception.getMessage();
		this.errorMessage = exception.getLocalizedMessage();
	}

	public BaseException(String errorCode, String errorMessage) {
		super(errorCode);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public BaseException(Exception cause, String errorCode, String errorMessage) {
		super(errorCode, cause);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public BaseException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
		this.errorMessage = StringUtils.EMPTY;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}