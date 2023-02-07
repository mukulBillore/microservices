package com.radissionBlu.user.service.userMicroService.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radissionBlu.user.service.userMicroService.model.User;
import com.radissionBlu.user.service.userMicroService.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/hi")
	public String hi() {
		return "controller is working";
	}

	@GetMapping("/getUser")
	public ResponseEntity<User> getUser(@Param("userID") String userID) {
		User userResponse = userService.getUser(userID);
		return new  ResponseEntity<User>(userResponse,HttpStatus.OK);
	}

	@GetMapping("/getAllUser")
	public ResponseEntity<List> getAllUser() {
		List<User> userList = userService.getAllUser();
		return new ResponseEntity<List>(userList,HttpStatus.OK);
	}

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User userSave = userService.saveUser(user);
		
		return new ResponseEntity<User>(userSave,HttpStatus.CREATED) ;

	}
}
