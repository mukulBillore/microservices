package com.radissionBlu.user.service.userMicroService.exception;

public class ResoureceNotFound extends RuntimeException {

	public ResoureceNotFound() {
		super("resource not find exception");
	}

	public ResoureceNotFound(String message) {
		super(message);
	}
}
