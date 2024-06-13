package com.techm.exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationHandler {

	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleValidationExceptions(MethodArgumentNotValidException me)
	{
		
		Map<String,String> errors = new HashMap<>();
		
		List<FieldError> fieldErrors = me.getBindingResult().getFieldErrors();
		
		for(FieldError error: fieldErrors)
		{
			String fieldName= error.getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		}
		
		return new ResponseEntity<Map<String,String>>(errors,HttpStatus.BAD_REQUEST);
		
	}
	
	
}
