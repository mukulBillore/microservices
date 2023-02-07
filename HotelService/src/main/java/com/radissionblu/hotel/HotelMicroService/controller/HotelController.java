package com.radissionblu.hotel.HotelMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radissionblu.hotel.HotelMicroService.model.HotelModel;
import com.radissionblu.hotel.HotelMicroService.service.HotelServiceInterface;

@RequestMapping("/hotel")
@RestController
public class HotelController {
	@Autowired
	HotelServiceInterface hotelService;

	@GetMapping("/getData")							
	public HotelModel getHotelData(@Param("id") String id) {
		return hotelService.getHotelData(id);
	}

	@GetMapping("/getAll")
	public List<HotelModel> getAllHotelData() {
		return hotelService.getAllHotelData();
	}
	
	@PostMapping("saveData")
	public HotelModel saveHotelData(@RequestBody HotelModel hotelData) {
		return hotelService.saveHotelData(hotelData);
	}

}
