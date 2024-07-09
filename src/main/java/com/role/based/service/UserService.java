package com.role.based.service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.role.based.model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Devendra", "dev@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Anil", "anil@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Suraj", "suraj@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Atul", "atul@gmail.com"));
	}

	public List<User> getUser() {
		return this.store;
	}
	
	public String currentUser(Principal principal) {
		return principal.getName();
	}
}
