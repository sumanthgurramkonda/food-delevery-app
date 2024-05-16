package com.techenthusiasist.foodcatelog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.techenthusiasist.foodcatelog.dto.FoodItemDto;
import com.techenthusiasist.foodcatelog.entity.FoodItem;

@Mapper
public interface FoodItemMapper {
	
	FoodItemMapper INSTANCE  = Mappers.getMapper(FoodItemMapper.class);
	
	FoodItem mapFoodItemDtoToFoodItem(FoodItemDto foodItemDto);
	FoodItemDto mapFoodItemToFoodItemDto(FoodItem foodItem);

}
