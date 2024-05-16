package com.techenthusiasist.orderservice.dto;

import java.util.List;

public class OrderDtoFromFE {
	
	private List<FoodItemDto> foodItems;
	private Restaurant restaurant;
	private Integer userId;
		
	public OrderDtoFromFE() {
		
	}

	public OrderDtoFromFE(Integer userId, List<FoodItemDto> foodItems, Restaurant restaurant) {
		this.foodItems = foodItems;
		this.userId = userId;
		this.restaurant = restaurant;
	}

	public List<FoodItemDto> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItemDto> foodItems) {
		this.foodItems = foodItems;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "OrderDto [foodItems=" + foodItems + ", userId=" + userId + ", restaurant=" + restaurant + "]";
	}
	
}
