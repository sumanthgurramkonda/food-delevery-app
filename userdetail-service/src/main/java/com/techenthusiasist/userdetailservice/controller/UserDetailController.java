package com.techenthusiasist.userdetailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techenthusiasist.userdetailservice.dto.UserDto;
import com.techenthusiasist.userdetailservice.service.UserDetailService;

@RestController
@RequestMapping("/user")
public class UserDetailController {
	
	@Autowired
	UserDetailService userDetailService;
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") int id ){
		UserDto dto = userDetailService.getUserById(id);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
		
	    UserDto dto = userDetailService.addUser(userDto);
	    return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

}
