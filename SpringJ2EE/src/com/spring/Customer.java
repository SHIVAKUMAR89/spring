package com.spring;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id 
	private int userId;	
	private String name;
	private String phoneNo;
	
	private String gender;
	
	
	private String technologies;
	
	@Embedded
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	@Override
	public String toString() {
		return "Customer name "+name+" gender "+gender+ " Technologies"+technologies;
	}

}
