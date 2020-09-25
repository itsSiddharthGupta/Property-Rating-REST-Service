package com.example.propertyrating.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_credentials")
public class UserAuth {
	@Id()
	private int id;
	@Column(columnDefinition = "text not null")
	private String email;
	@Column(columnDefinition = "text not null")
	private String password;
	public UserAuth(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
}
