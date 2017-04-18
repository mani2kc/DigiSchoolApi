package io.digischool.controller;

import io.digischool.Exception.DigiSchoolException;
import io.digischool.dto.response.ResponseDTO;
import io.digischool.util.MessageConstants;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

@ControllerAdvice
public class GlobalDefaultExceptionHandler extends ExceptionHandlerExceptionResolver{
	public static final String DEFAULT_ERROR_VIEW = "error";

	  @ExceptionHandler(value = DigiSchoolException.class)
	  @ResponseStatus(HttpStatus.OK)
	  public ResponseDTO defaultErrorHandler(HttpServletRequest req, DigiSchoolException e) throws Exception {

		  ResponseDTO response = new ResponseDTO();
		  response.setStatus(MessageConstants.fail);
		  response.setMessage(e.getMessage());
		  
	    return response;
	  }
	}