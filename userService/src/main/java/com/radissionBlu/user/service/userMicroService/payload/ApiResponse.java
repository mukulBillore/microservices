package com.radissionBlu.user.service.userMicroService.payload;

import org.springframework.http.HttpStatus;

public class ApiResponse {
	private String message;
	private boolean success;
	private HttpStatus status;

	// getters and setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public ApiResponse(String message, boolean success, HttpStatus status) {
		super();
		this.message = message;
		this.success = success;
		this.status = status;
	}

	// constructor using the fields
	public ApiResponse() {
		super();
	}

}
