package com.mayank.tigerAnalytics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.tigerAnalytics.model.UserFmsLogin;
import com.mayank.tigerAnalytics.repository.UserFmsLoginrepo;

@Service
public class UserServiceImpl {
	@Autowired
	private UserFmsLoginrepo ur;
	
	    public UserFmsLogin registerUser(UserFmsLogin user) {
	        return ur.save(user);
	    }
	    
	    public UserFmsLogin loginUser(String username, String password) {
	        UserFmsLogin user = ur.findByUsername(username);
	        if (user != null && (password == user.getPassword())) {
	            return user;
	        }
	        return null;
	    }
}
