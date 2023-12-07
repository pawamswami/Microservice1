package com.kotak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotak.dto.UserRegisterDto;
import com.kotak.entity.User;
import com.kotak.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;

	public String userRegister(UserRegisterDto dto) {
		User user = User.builder().emailId(dto.getEmailId()).name(dto.getName())
		.mobile(dto.getMobile()).build();
		
		repository.save(user);
		return "User created with this userid: "+user.getUserId();
	}

}
