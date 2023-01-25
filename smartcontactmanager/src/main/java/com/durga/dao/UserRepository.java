package com.durga.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durga.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	

}
