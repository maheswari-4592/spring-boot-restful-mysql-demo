package com.techm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.model.User;

import jakarta.validation.Valid;

@RequestMapping("/api")
@RestController
public class UserController {

	@PostMapping("/user")
	public ResponseEntity<String> createUser(@RequestBody @Valid   User user)
	{
		return new ResponseEntity<String>("User is valid", HttpStatus.CREATED);
	}
	
	
}
