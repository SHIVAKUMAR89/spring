package com.login;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class LoginDetails {
	@Id
	private int username;
	
	
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
}
