package com.altimetrik.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CustomExceptionMessage extends RuntimeException {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomExceptionMessage(String message) {
	        super(message);
	    }
}
