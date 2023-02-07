package com.radissionblu.hotel.HotelMicroService.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radissionblu.hotel.HotelMicroService.model.HotelModel;
import com.radissionblu.hotel.HotelMicroService.service.repository.HotelRepository;

@Service
public class HotelServiceImpl  implements HotelServiceInterface{

	@Autowired
	HotelRepository hotelRepo;
	
	public HotelModel getHotelData(String id) {
		
		return hotelRepo.findById(id).get();
	}

	public List<HotelModel> getAllHotelData() {
			
		return hotelRepo.findAll();
	}

	public HotelModel saveHotelData(HotelModel hotelData) {
		hotelData.setId(UUID.randomUUID().toString());
		
		return hotelRepo.save(hotelData);
	}

}
