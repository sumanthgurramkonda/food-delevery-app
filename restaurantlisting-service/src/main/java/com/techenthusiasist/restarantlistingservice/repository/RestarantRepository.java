package com.techenthusiasist.restarantlistingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techenthusiasist.restarantlistingservice.entity.Restaurant;

@Repository
public interface RestarantRepository extends JpaRepository<Restaurant, Integer> {


}
