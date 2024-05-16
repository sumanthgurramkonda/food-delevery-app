package com.techenthusiasist.restarantlistingservice.service;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techenthusiasist.restarantlistingservice.dto.RestaurantDto;
import com.techenthusiasist.restarantlistingservice.entity.Restaurant;
import com.techenthusiasist.restarantlistingservice.mapper.RestaurantMapper;
import com.techenthusiasist.restarantlistingservice.repository.RestarantRepository;

@Service
public class RestarantService {

	@Autowired
	private RestarantRepository restarantRepository;

	public List<RestaurantDto> findAllRestaurants() {
		
		List<Restaurant> restaurants = restarantRepository.findAll();
		return restaurants.stream().map(restaurant->
		                                         RestaurantMapper.INSTANCE
		                                         .mapRestaurantToRestaurantDto(restaurant))
				                                 .collect(Collectors.toList());
	
	}

	public RestaurantDto addRestaurant(RestaurantDto restaurantDto) {
		Restaurant restaurant = restarantRepository.save(RestaurantMapper.INSTANCE.mapRestaurantDtoToRestaurant(restaurantDto));
		return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(restaurant);
	}

	public RestaurantDto fetchByid(int id) {
		Optional<Restaurant> restaurant = restarantRepository.findById(id);
		if(restaurant.isPresent()) {
			return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(restaurant.get());
		}
		return null;
	}

}
