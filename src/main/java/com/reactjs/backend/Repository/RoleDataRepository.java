package com.reactjs.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactjs.backend.model.Role;

//To connect a project to database and we can directky access the functions of JpaRepository in our project
public interface RoleDataRepository extends JpaRepository<Role,Long>{

}
