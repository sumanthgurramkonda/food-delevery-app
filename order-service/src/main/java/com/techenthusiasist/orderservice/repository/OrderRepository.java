package com.techenthusiasist.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techenthusiasist.orderservice.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer>{

}
