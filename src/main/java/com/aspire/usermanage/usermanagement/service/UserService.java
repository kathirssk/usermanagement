package com.aspire.usermanage.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.usermanage.usermanagement.modal.User;
import com.aspire.usermanage.usermanagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
		
	}
	
	public Optional<User> getUser(Long userId) {
		return userRepository.findById(userId);
	}
	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
		
	}
	public boolean deleteUser(long userId) {
		userRepository.deleteById(userId);
		return true;
		
	}
	
	public boolean updateUser(int userId, User user) {
		user.setUserId(userId);
		userRepository.save(user);
		return true;
		
	}
}
