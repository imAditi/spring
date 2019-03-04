package com.example.userapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserIdException extends RuntimeException{
	
	private static final long serialversionUID = 1l;

     public UserIdException(String message) {
    	 
    	 super(message);
		
	}
	
	

}
