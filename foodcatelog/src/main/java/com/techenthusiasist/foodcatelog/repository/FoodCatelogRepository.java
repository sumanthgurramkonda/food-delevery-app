package com.techenthusiasist.foodcatelog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techenthusiasist.foodcatelog.entity.FoodItem;

@Repository
public interface FoodCatelogRepository extends JpaRepository<FoodItem, Integer> {

	List<FoodItem> findByRestaurantId(int id);

}
