package com.techenthusiasist.foodcatelog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techenthusiasist.foodcatelog.dto.FoodCatelog;
import com.techenthusiasist.foodcatelog.dto.FoodItemDto;
import com.techenthusiasist.foodcatelog.service.FoodCatelogService;

@RestController
@RequestMapping("/foodCatelog")
public class FoodCatelogController {
	
	@Autowired
	FoodCatelogService foodCatelogService;
	
	@PostMapping("/addFoodItem")
	public ResponseEntity<FoodItemDto> addFoodItem(@RequestBody FoodItemDto foodItemDto){
		FoodItemDto foodItem = foodCatelogService.addFoodItem(foodItemDto);
		return new ResponseEntity<>(foodItem,HttpStatus.CREATED);
	}
	
	 @GetMapping("/fetchRestaurantAndFoodItemsById/{restaurantId}")
	    public ResponseEntity<FoodCatelog> fetchRestauDetailsWithFoodMenu(@PathVariable Integer restaurantId){
		    FoodCatelog foodCataloguePage = foodCatelogService.fetchFoodCataloguePageDetails(restaurantId);
	        return new ResponseEntity<>(foodCataloguePage, HttpStatus.OK);


	    }
	

}
