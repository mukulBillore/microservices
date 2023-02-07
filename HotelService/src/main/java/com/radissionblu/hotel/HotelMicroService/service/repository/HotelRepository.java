package com.radissionblu.hotel.HotelMicroService.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radissionblu.hotel.HotelMicroService.model.HotelModel;

@Repository
public interface HotelRepository extends JpaRepository<HotelModel, String>{

}
