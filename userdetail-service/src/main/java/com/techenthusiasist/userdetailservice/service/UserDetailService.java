package com.techenthusiasist.userdetailservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techenthusiasist.userdetailservice.dto.UserDto;
import com.techenthusiasist.userdetailservice.entity.User;
import com.techenthusiasist.userdetailservice.mapper.UserMapper;
import com.techenthusiasist.userdetailservice.repository.UserDetailRepository;


@Service
public class UserDetailService {
	
	@Autowired
	UserDetailRepository userDetailRepository;

	public UserDto addUser(UserDto userDto) {
		
		User user = userDetailRepository.save(UserMapper.INSTANCE.mapUserDtoToUser(userDto));
		return UserMapper.INSTANCE.mapUserToUserDto(user);
	}

	public UserDto getUserById(int id) {
		Optional<User> user = userDetailRepository.findById(id);
		return UserMapper.INSTANCE.mapUserToUserDto(user.get());
	}

}
