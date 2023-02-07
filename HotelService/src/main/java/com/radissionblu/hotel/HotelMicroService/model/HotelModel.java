package com.radissionblu.hotel.HotelMicroService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HotelModel {
	@Id
	private String id;
	private String name;
	private String location;
	private String about;

	public String getId() {
		return id;
	}

//	private HotelModel(Builder builder) {
//        this.id = builder.id;
//        this.name = builder.name;
//        this.location = builder.location;
//        this.about = builder.about;
//    }
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public HotelModel(String id, String name, String location, String about) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.about = about;
	}
	public HotelModel() {
		super();
		
	}
	
	
}