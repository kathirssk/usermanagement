package com.aspire.usermanage.usermanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.usermanage.usermanagement.modal.User;
import com.aspire.usermanage.usermanagement.service.UserService;

/**
 * It is a controller class for USER table
 * 
 * @author kathiravan.sethurama
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	User user;

	@Autowired
	UserService userService;

	/**
	 * To fetch all users
	 * 
	 * @return
	 */
	@GetMapping(value = "/allUsers")
	public List<User> getAllUsers() {

		return userService.getAllUsers();

	}

	/**
	 * To fetch one user by UserID
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping(value = "/{userId}")
	public Optional<User> getUser(@PathVariable(value = "userId") int userId) {

		return userService.getUser(userId);
	}

	/**
	 * 
	 * To save one user into Db
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping("user")
	public boolean addUser(@RequestBody User user) {
		return userService.addUser(user);

	}

	/**
	 * To delete one User by userId
	 * @param userId
	 * @return
	 */
	@DeleteMapping(value="/{userId}")
	public boolean deleteUser(@PathVariable(value = "userId") int userId) {
		return userService.deleteUser(userId);
	}
	
	/**
	 * To update user by userId
	 * @return
	 */
	@PutMapping("/change/{userId}")
	public boolean updateUser(@PathVariable(value = "userId")int userId,@RequestBody User user) {
		return userService.updateUser(userId,user);
	}
}