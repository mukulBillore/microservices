package com.redissionblu.rating.RatingMicroService.RatingService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RatingModel {
	@Id
	private String ratingID;

	private String userID;

	private String hotelID;

	private int rating;

	private String feedback;

	// All field constructor
	public RatingModel(String ratingID, String userID, String hotelID, int rating, String feedback) {
		super();
		this.ratingID = ratingID;
		this.userID = userID;
		this.hotelID = hotelID;
		this.rating = rating;
		this.feedback = feedback;
	}

	public RatingModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters and setters
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

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
