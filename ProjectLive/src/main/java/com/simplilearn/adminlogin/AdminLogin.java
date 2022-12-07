package com.simplilearn.adminlogin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminLogin {
	
	@Id
	
	@Column(name = "UserName")
	private String UserName;
	@Column(name = "Password")
	private String Password;
	
	
	
	public AdminLogin() {
	}
	
	
	
	public AdminLogin(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	

}
