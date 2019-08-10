package com.aptechnolo.detecto.detecto.login;

import java.util.Optional;

import com.aptechnolo.detecto.detecto.GeneralResponse;

public class LoginResponse {

	private GeneralResponse generalResponse;
	private User user;
	public LoginResponse() {
	}
	public LoginResponse( Optional<User> optional,int statusCode, String message) {
		this.generalResponse=new GeneralResponse(statusCode,message);
		this.user = optional.get();
	}
	public User getuser() {
		return user;
	}
	public void setuser(User user) {
		this.user = user;
	}
}
