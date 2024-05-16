package com.techenthusiasist.userdetailservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.techenthusiasist.userdetailservice.dto.UserDto;
import com.techenthusiasist.userdetailservice.entity.User;

@Mapper
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	User mapUserDtoToUser(UserDto userDto);
	UserDto mapUserToUserDto(User user);
}
