package com.radissionBlu.user.service.userMicroService.service;

import java.util.List;

import com.radissionBlu.user.service.userMicroService.model.User;

public interface UserServiceInterface {

	public User saveUser(User userData);

	public User getUser(String userID);

	public List<User> getAllUser();
}
