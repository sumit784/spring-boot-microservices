package com.springboot.exceptions;

public class MyException extends Exception {
	
	private String message;
	
	public MyException(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
