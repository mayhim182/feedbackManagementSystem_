package com.mayank.tigerAnalytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.tigerAnalytics.model.Feedback;
import com.mayank.tigerAnalytics.services.FeedbackServImpl;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@RestController
@CrossOrigin("*")
public class FeedbackController {
	
	
	@Autowired
	private FeedbackServImpl fs;
	
	//To add a feedback
	@PostMapping(path="add/Feedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return fs.addFeedback(feedback);
	}
	
	//To update feedback by id
	@PutMapping(path="update/{id}")
	public Feedback updateFeedbackById(@PathVariable Long id, @RequestBody Feedback feedback) throws Exception {
		return fs.updateFeedback(id, feedback);
	}
	
	//to get feedbackList
	  @GetMapping(path="getAllFeedbacks")
	    public ResponseEntity<List<Feedback>> getAllFeedbacks() {
	        List<Feedback> feedbacks = fs.getFeedbacks();
	        return new ResponseEntity<>(feedbacks, HttpStatus.OK);
	    }
	//Get all feedbacks by id
	  @GetMapping(path="/{id}")
	  public ResponseEntity<Feedback> getFeedbackById(@PathVariable Long id) throws Exception {
	        Feedback feedback = fs.getFeedbackById(id);
	        return new ResponseEntity<>(feedback, HttpStatus.OK);
	    }
	  
	  @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteFeedback(@PathVariable Long id) throws Exception {
	        fs.deleteFeedback(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	  
}
