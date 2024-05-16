package com.techenthusiasist.restarantlistingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techenthusiasist.restarantlistingservice.dto.RestaurantDto;
import com.techenthusiasist.restarantlistingservice.service.RestarantService;

@RestController
@RequestMapping("/restaurant")
public class RestarantController {
	
	@Autowired
	RestarantService restarantService;
	
	
	@GetMapping("/fetchAllRestaurants")
	public ResponseEntity<List<RestaurantDto>> fetchAllRestaurants(){
		
		List<RestaurantDto> restaurants = restarantService.findAllRestaurants();
		return new ResponseEntity<>(restaurants, HttpStatus.OK);
	}
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<RestaurantDto> addRestaurant(@RequestBody RestaurantDto restaurantDto){
		
	       RestaurantDto dto = restarantService.addRestaurant(restaurantDto);
	       return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}
	@GetMapping("/fetchRestaurant/{id}")
	public ResponseEntity<RestaurantDto> addRestaurant(@PathVariable("id") int id){
		
	       RestaurantDto dto = restarantService.fetchByid(id);
	       return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

}
