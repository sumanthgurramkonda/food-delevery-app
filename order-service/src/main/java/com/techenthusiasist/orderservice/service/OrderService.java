package com.techenthusiasist.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.techenthusiasist.orderservice.dto.OrderDto;
import com.techenthusiasist.orderservice.dto.OrderDtoFromFE;
import com.techenthusiasist.orderservice.dto.UserDto;
import com.techenthusiasist.orderservice.entity.Order;
import com.techenthusiasist.orderservice.mapper.OrderMapper;
import com.techenthusiasist.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	SequenceGenerator sequenceGenerator;
	
	@Autowired
	RestTemplate restTemplate;

	public OrderDto saveOrder(OrderDtoFromFE orderDetails) {
		Integer newOrderId = sequenceGenerator.generateNextOrder();
		UserDto userDto = fetchUserDetailsFromUserId(orderDetails.getUserId());
		Order orderTobeSave = new Order(newOrderId, orderDetails.getFoodItems(),orderDetails.getRestaurant(),userDto);
		orderRepository.save(orderTobeSave);
		return OrderMapper.INSTANCE.mapOrderToOrderDto(orderTobeSave);
	}

	private UserDto fetchUserDetailsFromUserId(Integer userId) {
		return restTemplate.getForObject("http://USERDETAIL-SERVICE/user/getUser/"+userId, UserDto.class);
	}

}












