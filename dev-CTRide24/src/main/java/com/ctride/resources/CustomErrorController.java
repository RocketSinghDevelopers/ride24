package com.ctride.resources;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ctride.exception.BaseException;
import com.ctride.exception.ValidationException;
import com.ctride.model.ErrorJson;

@RestController
@RequestMapping(value = "/error")
public class CustomErrorController implements ErrorController {

	@RequestMapping
	@ExceptionHandler(BaseException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	ErrorJson error(HttpServletRequest request, HttpServletResponse response) {
		// Appropriate HTTP response code (e.g. 404 or 500) is automatically set
		// by Spring.
		// Here we just define response body.
		return new ErrorJson("", "");
	}

	/*@RequestMapping
	@ExceptionHandler(ValidationException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	ErrorJson validationError(HttpServletRequest request,
			HttpServletResponse response, ValidationException exception) {

		return null;
	}*/

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
