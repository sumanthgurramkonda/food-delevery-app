package com.techenthusiasist.orderservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.techenthusiasist.orderservice.dto.OrderDto;
import com.techenthusiasist.orderservice.entity.Order;

@Mapper
public interface OrderMapper {
	
	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	
	Order mapOrderDtoToOrder(OrderDto orderDto);
	OrderDto mapOrderToOrderDto(Order order);

}