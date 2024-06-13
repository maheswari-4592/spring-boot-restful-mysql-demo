package com.techm.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {

	public User(@NotBlank(message = "name is mandatory")
	String name,
	@Email(message = "Email should be valid") 
	@NotBlank(message = "Email is mandatory") 
	String email,
	@Size(min = 8, message = "Password should have atleast 8 characters") 
	String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@NotBlank(message = "name is mandatory")
	private String name;
	
	@Email(message = "Email should be valid")
	@NotBlank(message="Email is mandatory")
	private String email;
	
	@Size(min = 8,message = "Password should have atleast 8 characters")
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}