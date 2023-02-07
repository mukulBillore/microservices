package com.radissionBlu.user.service.userMicroService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.radissionBlu.user.service.userMicroService.payload.ApiResponse;

public class GlobalExceptionHandler {

	public ResponseEntity<ApiResponse> handlerResourseNotFoundException(ResoureceNotFound exception) {

		ApiResponse response = new ApiResponse(exception.getMessage(), true, HttpStatus.NOT_FOUND);

		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}