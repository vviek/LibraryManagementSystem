package com.reactjs.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactjs.backend.model.Role;

public interface RoleDataRepository extends JpaRepository<Role,Long>{

}
