package com.reactjs.backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactjs.backend.Repository.UserDataRepository;
import com.reactjs.backend.model.User;


//Used to write business logic
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

	public Optional<User> findByUserId(Long id) {

		return userDataRepository.findById(id);
	}

	public Boolean SaveUserData(User userData) {

		userDataRepository.save(userData);

		return true;
	}

	public Boolean UpdateUserData(User userData) {

		User updateUser;
		Long userId = new Long(userData.getId());
		updateUser = userDataRepository.findById(userId).get();
		updateUser.setName(userData.getName());
		updateUser.setEmail(userData.getEmail());
		userDataRepository.save(userData);
		return true;
	}

	public Boolean deleteUserId(Long userId) {

		userDataRepository.deleteById(userId);

		return true;
	}
}
