package com.example.propertyrating.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService {
	@Autowired
	private UserRepository userRepository;
	public boolean authenticateUser(String email, String password) {
		boolean isUserExists = userRepository.existsByEmailAndPassword(email, password);
		return isUserExists;
	}
	
	public void addMe(UserAuth userAuth) {
		userRepository.save(userAuth);
	}
}
