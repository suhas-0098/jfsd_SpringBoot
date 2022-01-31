package com.klef.demo.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.klef.demo.model.User;
import com.klef.demo.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

