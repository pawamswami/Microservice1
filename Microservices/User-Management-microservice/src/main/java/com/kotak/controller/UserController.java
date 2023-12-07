package com.kotak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kotak.dto.UserRegisterDto;
import com.kotak.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public String userRegister(@RequestBody UserRegisterDto dto) {
	  return service.userRegister(dto);
	}
}
