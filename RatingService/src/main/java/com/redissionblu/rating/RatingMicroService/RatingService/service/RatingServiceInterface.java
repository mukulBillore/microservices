package com.redissionblu.rating.RatingMicroService.RatingService.service;


import com.redissionblu.rating.RatingMicroService.RatingService.model.RatingModel;
import com.redissionblu.rating.RatingMicroService.RatingService.response.RatingResponse;

public interface RatingServiceInterface {

	// save ratings 
	public RatingResponse saveRating(RatingModel rating );
	
	// get all ratings 
	public RatingResponse getAllRating();
	
	// get ratings by rating id 
	public RatingResponse getRatingByRatingId(String ratingId );
	
	// get all rating by user id 
	public RatingResponse getRatingUserId(String userId );
	
	
	// get all rating by hotel id 
	public RatingResponse getRatingHotelId(String hotelId );
	
	
	
	
}
