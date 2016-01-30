package com.ctride.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class ExceptionHandlerAdvice {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	public static final String DEFAULT_ERROR_VIEW = "error";

	//@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	//@ExceptionHandler(BaseException.class)
	public ModelAndView handleExcepton(HttpServletRequest request, Exception e) {
		ModelAndView mav = new ModelAndView(DEFAULT_ERROR_VIEW);
		mav.addObject("exception", e.getMessage());
		mav.addObject("url", request.getRequestURL());
		return mav;
	}
}
