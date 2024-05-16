package com.techenthusiasist.userdetailservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techenthusiasist.userdetailservice.entity.User;

public interface UserDetailRepository extends JpaRepository<User, Integer>{

	
}
