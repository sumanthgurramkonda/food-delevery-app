package com.techenthusiasist.foodcatelog.dto;

import java.util.List;

import com.techenthusiasist.foodcatelog.entity.FoodItem;
import com.techenthusiasist.foodcatelog.entity.Restaurant;

public class FoodCatelog {
	
	private List<FoodItem> foodItemsList;
	private Restaurant restaurant;
	
	public FoodCatelog() {

	}
	public FoodCatelog(List<FoodItem> foodItemsList, Restaurant restaurant) {
		super();
		this.foodItemsList = foodItemsList;
		this.restaurant = restaurant;
	}
	public List<FoodItem> getFoodItemsList() {
		return foodItemsList;
	}
	public void setFoodItemsList(List<FoodItem> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
}
