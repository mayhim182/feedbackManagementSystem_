package com.mayank.tigerAnalytics.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.tigerAnalytics.model.Feedback;
import com.mayank.tigerAnalytics.repository.FeedbackRepo;

@Service
public class FeedbackServImpl {
	
	@Autowired
	private FeedbackRepo feedbackrepo;
	
	
	
	public Feedback addFeedback(Feedback feedback) {
		Feedback f=feedbackrepo.save(feedback);
		return f;
	}
	
	public Feedback getFeedbackById(Long id) throws Exception {
		return feedbackrepo.findById(id).orElseThrow(()->new Exception("Feedback not found for " +id));
	}
	
	public List<Feedback> getFeedbacks(){
		return feedbackrepo.findAll();
	}
	
	public Feedback updateFeedback(Long id, Feedback feedback) throws Exception {
		Feedback f = getFeedbackById(id);
		f=feedback;
		return feedbackrepo.save(f);
	}
	
	public void deleteFeedback(Long id) throws Exception
	{
		Feedback f=getFeedbackById(id);
		feedbackrepo.delete(f);
	}
	
}
