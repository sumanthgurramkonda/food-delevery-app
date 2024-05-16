package com.techenthusiasist.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techenthusiasist.orderservice.dto.OrderDto;
import com.techenthusiasist.orderservice.dto.OrderDtoFromFE;
import com.techenthusiasist.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@PostMapping("/saveOrder")
	public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDtoFromFE orderDto){
		
		OrderDto dto = orderService.saveOrder(orderDto);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}
}








