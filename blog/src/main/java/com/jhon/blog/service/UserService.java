package com.jhon.blog.service;

import java.util.List;

import com.jhon.blog.payload.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(UserDto user);

	List<UserDto> getAllUsers(UserDto user);

	void deleteUser(Integer userId);
}
