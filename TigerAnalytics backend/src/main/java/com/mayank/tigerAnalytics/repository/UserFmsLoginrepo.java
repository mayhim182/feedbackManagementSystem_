package com.mayank.tigerAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.tigerAnalytics.model.UserFmsLogin;

public interface UserFmsLoginrepo extends JpaRepository<UserFmsLogin, Long> {
    UserFmsLogin findByUsername(String username);
}