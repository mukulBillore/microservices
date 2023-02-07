package com.radissionBlu.user.service.userMicroService.model;

public class Rating {
	private String ratingID;
	private String userID;
	private String hotelID;
	private int rating;
	private String feedbackl;

	public String getRatingID() {
		return ratingID;
	}

	public void setRatingID(String ratingID) {
		this.ratingID = ratingID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedbackl() {
		return feedbackl;
	}

	public void setFeedbackl(String feedbackl) {
		this.feedbackl = feedbackl;
	}

// constructors
	public Rating(String ratingID, String userID, String hotelID, int rating, String feedbackl) {
		super();
		this.ratingID = ratingID;
		this.userID = userID;
		this.hotelID = hotelID;
		this.rating = rating;
		this.feedbackl = feedbackl;
	}

	public Rating() {
		super();

	}

}
