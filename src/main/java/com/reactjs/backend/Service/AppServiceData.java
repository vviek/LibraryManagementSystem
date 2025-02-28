package com.reactjs.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactjs.backend.Repository.UserDataRepository;
import com.reactjs.backend.model.User;

@Service
public class AppServiceData {

	@Autowired
	UserDataRepository userDataRepository;
	
	
	public List<User> GetAllusers() {
		
		return userDataRepository.findAll();
	}
	
	
	public List<User> findByEmailId(String email) {
		
		return userDataRepository.findByEmail(email);
	}
	
	
	
	
}
