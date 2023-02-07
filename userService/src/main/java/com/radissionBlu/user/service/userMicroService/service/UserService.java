package com.radissionBlu.user.service.userMicroService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radissionBlu.user.service.userMicroService.exception.ResoureceNotFound;
import com.radissionBlu.user.service.userMicroService.model.User;
import com.radissionBlu.user.service.userMicroService.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {
	@Autowired
	private UserRepository userRepo;

	public User saveUser(User userData) {
		userData.setUserId(UUID.randomUUID().toString());	
		return userRepo.save(userData);

	}

	public User getUser(String userID) {
		// TODO Auto-generated method stub
		System.out.print("the user ID is : " + userRepo.getByUserId(userID));
		userRepo.findById(userID).orElseThrow(() -> new ResoureceNotFound("User with this userId not found "));
		return userRepo.getByUserId(userID);

	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
	