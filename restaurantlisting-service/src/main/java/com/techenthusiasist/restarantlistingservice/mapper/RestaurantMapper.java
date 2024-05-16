package com.techenthusiasist.restarantlistingservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.techenthusiasist.restarantlistingservice.dto.RestaurantDto;
import com.techenthusiasist.restarantlistingservice.entity.Restaurant;

@Mapper
public interface RestaurantMapper {
	
	RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
	
	RestaurantDto mapRestaurantToRestaurantDto(Restaurant restaurant);
	Restaurant mapRestaurantDtoToRestaurant(RestaurantDto restaurantDto);
}
