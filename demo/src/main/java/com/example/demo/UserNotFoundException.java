package com.example.demo;

import org.apache.commons.httpclient.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	

	public UserNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
