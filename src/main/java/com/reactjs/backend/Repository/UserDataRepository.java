package com.reactjs.backend.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactjs.backend.model.User;
import java.util.List;


public interface UserDataRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsernameOrEmail(String username, String email);
	
			List<User> findByEmail(String email);
}
