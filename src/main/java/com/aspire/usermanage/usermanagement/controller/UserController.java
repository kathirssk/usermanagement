package com.aspire.usermanage.usermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.usermanage.usermanagement.modal.User;
import com.aspire.usermanage.usermanagement.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	User user; 
	
	UserService userService;
	
	@GetMapping(value="/all")
	public List<User> getAllUsers(){
		
		return userService.getAllUsers();
		
	}
	@GetMapping(value="/{userId}")
	public User getUser(@PathVariable(value = "userId") Long userId){
		
		return userService.getUser(userId);
	}
	@PostMapping(value="{user}")
	public User addUser() {
				
		return user;
		
	}
	@DeleteMapping(value="{user}")
	public User deleteUser() {
		return user;
		
	}
}
