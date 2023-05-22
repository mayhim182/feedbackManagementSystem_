package com.mayank.tigerAnalytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserFmsLogin {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserFmsLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserFmsLogin(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
    
    
    
    
}