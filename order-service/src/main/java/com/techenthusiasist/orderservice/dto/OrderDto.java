package com.techenthusiasist.orderservice.dto;

import java.util.List;

public class OrderDto {
	
	private Integer orderId;
	private List<FoodItemDto> foodItems;
	private Restaurant restaurant;
	private UserDto userDto;
	
	public OrderDto() {
		
	}
	

	public OrderDto(Integer orderId, List<FoodItemDto> foodItems, Restaurant restaurant, UserDto userDto) {
		super();
		this.orderId = orderId;
		this.foodItems = foodItems;
		this.restaurant = restaurant;
		this.userDto = userDto;
	}


	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<FoodItemDto> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItemDto> foodItems) {
		this.foodItems = foodItems;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}


}
