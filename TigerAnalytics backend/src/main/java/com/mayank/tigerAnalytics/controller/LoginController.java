package com.mayank.tigerAnalytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.tigerAnalytics.services.UserServiceImpl;

@RestController
@CrossOrigin("*")
public class LoginController {
	
	@Autowired
	private UserServiceImpl us;
	
	
	
}
