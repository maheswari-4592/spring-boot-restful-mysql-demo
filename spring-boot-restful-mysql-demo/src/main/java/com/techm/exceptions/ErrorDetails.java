package com.techm.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ErrorDetails 
{
	
	private int statusCode;
    private String message;
    private String details;
    
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ErrorDetails [statusCode=" + statusCode + ", message=" + message + ", details=" + details + "]";
	}
	public ErrorDetails(int statusCode, String message, String details) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.details = details;
	}
	public ErrorDetails()
	{
		
	}

}