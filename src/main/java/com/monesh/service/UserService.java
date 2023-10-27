package com.monesh.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.monesh.model.User;
import com.monesh.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
