package com.radissionblu.hotel.HotelMicroService.service;

import java.util.List;
import java.util.Optional;

import com.radissionblu.hotel.HotelMicroService.model.HotelModel;

public interface HotelServiceInterface {

	public HotelModel getHotelData(String id);

	public List<HotelModel> getAllHotelData();

	public HotelModel saveHotelData(HotelModel hotelData);

}
