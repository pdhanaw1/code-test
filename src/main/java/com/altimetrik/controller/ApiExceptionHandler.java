package com.altimetrik.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exception.handle.CustomException;


@ControllerAdvice
public class ApiExceptionHandler extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<CustomException> generalException(Exception e) throws Exception{
//		CustomException eR = new CustomException();
//		eR.setId(HttpStatus.INTERNAL_SERVER_ERROR.value());
//		eR.setMessage(e.getMessage());
//		
//		return new ResponseEntity<CustomException>(eR,HttpStatus.INTERNAL_SERVER_ERROR );
//		
//}
	
	@ExceptionHandler(CustomExceptionMessage.class)
	public ResponseEntity<Object> validationException(CustomExceptionMessage e) throws Exception{
		CustomException eR = new CustomException();
		eR.setId(HttpStatus.BAD_REQUEST.value());
		eR.setMessage(e.getMessage());
		
		return new ResponseEntity<>(eR,HttpStatus.BAD_REQUEST );
}
}
