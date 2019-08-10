package com.aptechnolo.detecto.detecto.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	private String userName;
	private String password;
	private String location;
	
	public User() {
	}
	
	public User(Integer userId, String userName, String password, String location) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.location = location;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", location=" + location
				+ "]";
	}
	
	
	
	
}
