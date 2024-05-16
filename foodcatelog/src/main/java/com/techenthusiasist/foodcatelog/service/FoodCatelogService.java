package com.techenthusiasist.foodcatelog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.techenthusiasist.foodcatelog.dto.FoodCatelog;
import com.techenthusiasist.foodcatelog.dto.FoodItemDto;
import com.techenthusiasist.foodcatelog.entity.FoodItem;
import com.techenthusiasist.foodcatelog.entity.Restaurant;
import com.techenthusiasist.foodcatelog.mapper.FoodItemMapper;
import com.techenthusiasist.foodcatelog.repository.FoodCatelogRepository;

@Service
public class FoodCatelogService {
	
	@Autowired
	FoodCatelogRepository foodCatelogRepository;
	
	@Autowired
	RestTemplate restTemplate;

	public FoodItemDto addFoodItem(FoodItemDto foodItemDto) {
		FoodItem foodItem = foodCatelogRepository.save(FoodItemMapper.INSTANCE.mapFoodItemDtoToFoodItem(foodItemDto));
		return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDto(foodItem);
	}

	public FoodItemDto getFoodItemById(int id) {
		Optional<FoodItem> foodItem = foodCatelogRepository.findById(id);
		return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDto(foodItem.get());
	}

	public FoodCatelog fetchFoodCataloguePageDetails(Integer restaurantId) {
		 List<FoodItem> foodItemList =  fetchFoodItemList(restaurantId);
	     Restaurant restaurant = fetchRestaurantDetailsFromRestaurantMS(restaurantId);
	     return createFoodCataloguePage(foodItemList, restaurant);
	}

	private FoodCatelog createFoodCataloguePage(List<FoodItem> foodItemList, Restaurant restaurant) {
		FoodCatelog foodCatelog = new FoodCatelog();
	    foodCatelog.setFoodItemsList(foodItemList);
	    foodCatelog.setRestaurant(restaurant);
		return foodCatelog;
	}

	private Restaurant fetchRestaurantDetailsFromRestaurantMS(Integer restaurantId) {
		
		return restTemplate.getForObject("http://RESTAURANTLISTING-SERVICE/restaurant/fetchRestaurant/"+restaurantId,Restaurant.class);
	}

	private List<FoodItem> fetchFoodItemList(Integer restaurantId) {
		return foodCatelogRepository.findByRestaurantId(restaurantId);
	}

}

















