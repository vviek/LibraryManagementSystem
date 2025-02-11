package com.reactjs.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactjs.backend.model.User;

public interface UserDataRepository extends JpaRepository<User, Long>{

}
