package com.reactjs.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactjs.backend.Repository.UserDataRepository;

@Service
public class AppServiceData {

	@Autowired
	UserDataRepository userDataRepository;
	
	
}
