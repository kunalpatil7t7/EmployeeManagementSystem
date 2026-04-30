package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AppUser;
import com.example.demo.repo.UserRepo;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@PostMapping("/signup")
	public AppUser signup(@RequestBody AppUser user) {
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		if(user.getRole()== null) {
			user.setRole("ROLE_USER");
		}
		
		return repo.save(user);
	}
}
