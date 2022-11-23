package com.app.controller;

import org.springframework.web.bind.annotation.crossorigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Restcontroller;
@Restcontroller
@RequestMapping("/user")
@crossorigin(origins="http://http://localhost:4200")

public class UserController {
	@Autowired
	private UserRepo repo;
	@PostMapping("/login")
	public ResponseEntity<user> loginUser(@RequestBody User userData)
	{
		return null;
	}

}
