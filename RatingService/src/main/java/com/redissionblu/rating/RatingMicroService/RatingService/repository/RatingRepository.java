package com.redissionblu.rating.RatingMicroService.RatingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redissionblu.rating.RatingMicroService.RatingService.model.RatingModel;

@Repository
public interface RatingRepository extends JpaRepository<RatingModel, String > {

}
