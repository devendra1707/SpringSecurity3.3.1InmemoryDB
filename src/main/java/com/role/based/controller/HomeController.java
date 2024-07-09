package com.role.based.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.role.based.model.User;
import com.role.based.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> home() {
		System.out.println("User List");
		return userService.getUser();
	}

	@GetMapping("/current-user")
	public String currentUser(Principal userName) {
		return userService.currentUser(userName);
	}

}
