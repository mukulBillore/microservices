package com.redissionblu.rating.RatingMicroService.RatingService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redissionblu.rating.RatingMicroService.RatingService.model.RatingModel;
import com.redissionblu.rating.RatingMicroService.RatingService.response.RatingResponse;
import com.redissionblu.rating.RatingMicroService.RatingService.service.RatingServiceInterface;

@RestController
@RequestMapping("rating")
public class RatingContorller {
	
	@Autowired
	private RatingServiceInterface RatingModel ;
	
	// Save Rating
	@PostMapping("save")
	public ResponseEntity<RatingResponse> saveRating(@RequestBody RatingModel rating) {
		RatingResponse response = RatingModel.saveRating(rating);
		return new ResponseEntity<RatingResponse>(response , HttpStatus.OK);
	}
	// Get all the ratings 
	@GetMapping("getAll")
	public ResponseEntity<RatingResponse> getAllRating() {
		RatingResponse response = RatingModel.getAllRating();
		return new ResponseEntity<RatingResponse>(response , HttpStatus.FOUND);
	}
	// Get all ratings by rating id
	@GetMapping("getAllbyRatingId")
	public ResponseEntity<RatingResponse> getRatingByRatingId(@Param("ratingId") String ratingId) {
		RatingResponse response = RatingModel.getRatingByRatingId(ratingId);
		return new ResponseEntity<RatingResponse>(response , HttpStatus.FOUND);
		
	}
	// Get all rating by user id 
	@GetMapping("getAllbyUserId")
	public ResponseEntity<RatingResponse> getRatingUserId(@Param("userId") String userId) {
		RatingResponse response = RatingModel.getRatingUserId(userId);
		return new ResponseEntity<RatingResponse>(response , HttpStatus.FOUND);
	}
	// Get All rating by hotel id
	@GetMapping("getAllbyHotelId")
	public ResponseEntity<RatingResponse> getRatingHotelId(@Param("hotelId") String hotelId) {
		RatingResponse response = RatingModel.getRatingHotelId(hotelId);
		return new ResponseEntity<RatingResponse>(response , HttpStatus.FOUND);
	}

}
