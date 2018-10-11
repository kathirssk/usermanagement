package com.aspire.usermanage.usermanagement.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.usermanage.usermanagement.modal.User;
import com.aspire.usermanage.usermanagement.repository.UserRepository;

/**
 * 
 * It has all the Business and DAO functionality of User 
 * 
 * @author kathiravan.sethurama
 *
 */
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	static final Logger LOG =Logger.getLogger(UserService.class.getName());
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
		
	}
	
	public Optional<User> getUser(int userId) {
		return userRepository.findById(userId);
	}
	public boolean addUser(User user) {
		userRepository.insert(user);
		return true;
		
	}
	public boolean deleteUser(int userId) {
		userRepository.deleteById(userId);
		return true;
		
	}
	
	public boolean updateUser(int userId, User user) {
		user.setUserId(userId);
		userRepository.save(user);
		return true;
		
	}
}
