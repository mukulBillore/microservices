package com.redissionblu.rating.RatingMicroService.RatingService.response;

public class RatingResponse {

	private Object data;
	
	private String message;

	
	
	
	public RatingResponse() {
		super();
		
	}

	public RatingResponse(Object data, String message) {
		super();
		this.data = data;
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
