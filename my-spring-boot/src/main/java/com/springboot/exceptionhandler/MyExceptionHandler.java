package com.springboot.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springboot.exceptions.MyException;

@RestControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler
	public String handleTestException (MyException exception) {
		return exception.getMessage();
	}
}
