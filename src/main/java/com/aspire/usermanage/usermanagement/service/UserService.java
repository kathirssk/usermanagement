package com.aspire.usermanage.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aspire.usermanage.usermanagement.modal.User;
import com.aspire.usermanage.usermanagement.repository.UserRepository;

public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
		
	}
	
	public User getUser(Long userId) {
		return userRepository.getOne(userId);
	}
	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
		
	}
	public boolean deleteUser(long userId) {
		User user=userRepository.getOne(userId);
		userRepository.delete(user);
		return true;
		
	}
	
	public boolean updateUser(int userId, User user) {
		user.setUserId(userId);
		userRepository.save(user);
		return true;
		
	}
}
