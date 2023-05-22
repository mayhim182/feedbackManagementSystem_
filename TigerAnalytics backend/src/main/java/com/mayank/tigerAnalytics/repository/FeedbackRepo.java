package com.mayank.tigerAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayank.tigerAnalytics.controller.FeedbackController;
import com.mayank.tigerAnalytics.model.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback,Long>{

		
}
