package com.mayank.tigerAnalytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback_table")
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private boolean like_dislike; //True for like
	private byte[] image_ss;
	private String name;
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public boolean isLike_dislike() {
		return like_dislike;
	}
	public void setLike_dislike(boolean like_dislike) {
		this.like_dislike = like_dislike;
	}
	public byte[] getImage_ss() {
		return image_ss;
	}
	public void setImage_ss(byte[] image_ss) {
		this.image_ss = image_ss;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(Long id, String title, String desc, boolean like_dislike, byte[] image_ss, String name,
			String email) {
		super();
		
		this.title = title;
		this.description = desc;
		this.like_dislike = like_dislike;
		this.image_ss = image_ss;
		this.name = name;
		this.email = email;
	}
	
	
	
}
