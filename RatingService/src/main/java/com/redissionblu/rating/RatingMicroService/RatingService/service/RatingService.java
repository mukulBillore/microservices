package com.redissionblu.rating.RatingMicroService.RatingService.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redissionblu.rating.RatingMicroService.RatingService.model.RatingModel;
import com.redissionblu.rating.RatingMicroService.RatingService.repository.RatingRepository;
import com.redissionblu.rating.RatingMicroService.RatingService.response.RatingResponse;

@Service
public class RatingService implements RatingServiceInterface {

	@Autowired
	private RatingRepository ratingRepo;

	private static final Logger LOG = LoggerFactory.getLogger(RatingServiceInterface.class);

	// save the rating
	@SuppressWarnings("finally")
	public RatingResponse saveRating(RatingModel rating) {
		RatingResponse response = new RatingResponse();
		LOG.info("saveRating method starts ");
		try {
			rating.setRatingID(UUID.randomUUID().toString());
			RatingModel ratingModel = ratingRepo.save(rating);
				
			response.setData(ratingModel);
			response.setMessage("Rating data saved sucussfully ");
			LOG.info("rating is sucussesfully returned from DB ");
		} catch (Exception e) {
			LOG.error("error in servicing the data from saveRating", e);
			response.setData(e);
			response.setMessage("server side error contact your admin");
		} finally {
			return response;
		}
	}

	// get all the ratings
	@SuppressWarnings("finally")
	public RatingResponse getAllRating() {
		RatingResponse response = new RatingResponse();
		LOG.info("getAllRating method starts ");

		try {
			List<RatingModel> RatingList = ratingRepo.findAll();
			response.setData(RatingList);
			response.setMessage("Rating data found sucussfully ");
			LOG.info("ratings are sucussesfully returned from DB ");
		} catch (Exception e) {
			LOG.error("error in servicing the data from getAllRating", e);
			response.setData("internal server side error contact your admin.");
			response.setMessage("All Rating data not found sucussfully ");

		} finally {
			return response;
		}

	}

	// get a rating bt rating Id
	@SuppressWarnings("finally")
	public RatingResponse getRatingByRatingId(String ratingId) {
		RatingResponse response = new RatingResponse();

		LOG.info("getRatingByRatingId  method starts ");
		try {
			RatingModel ratingModel = ratingRepo.findById(ratingId).get();
			response.setData(ratingModel);
			response.setMessage("Rating data of id : "+ratingId+"found sucussfully");
			LOG.info("rating is sucussesfully returned from DB ");
		} catch (Exception e) {
			LOG.error("error in servicing the data from getAllRating", e);
			response.setData("internal server side error contact your admin.".toString());
			response.setMessage("Rating data of id : "+ratingId+"  not found ");

		} finally {
			return response;
		}
	}

	// get all the ratings by userId
	@SuppressWarnings("finally")
	public RatingResponse getRatingUserId(String userId) {
		//List<RatingModel> RatingList;
		LOG.info("getRatingUserId  method starts ");
		RatingResponse response = new RatingResponse();
		try {
			RatingModel ratingModel = ratingRepo.findById(userId).get();
			response.setData(ratingModel);
			response.setMessage("Rating data of id : "+userId+"found sucussfully");
			LOG.info("rating is sucussesfully returned from DB ");
		} catch (Exception e) {
			LOG.error("error in servicing the data from getAllRating", e);
			response.setData("internal server side error contact your admin.".toString());
			response.setMessage("Rating data of id : "+userId+"  not found ");

		} finally {
			return response;
		}
	}

	// get all the ratings by hotel id
	
	public RatingResponse getRatingHotelId(String hotelId) {
	//	List<RatingModel> RatingList;
		LOG.info("getRatingHotelId method starts ");

		return null;
	}

}
