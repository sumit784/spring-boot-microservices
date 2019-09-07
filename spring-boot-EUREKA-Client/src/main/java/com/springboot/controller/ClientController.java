package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	
	//@Value("${config.server.username}")
	private String msgProperty = "Welcome to Spring boot";
	
	
	@RequestMapping("/getDetails")
	public String fetchConfigProperty() {
		
		return msgProperty;
	}
	

}
