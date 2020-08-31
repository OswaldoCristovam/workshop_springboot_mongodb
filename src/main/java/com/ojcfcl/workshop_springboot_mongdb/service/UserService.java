package com.ojcfcl.workshop_springboot_mongdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojcfcl.workshop_springboot_mongdb.domain.User;
import com.ojcfcl.workshop_springboot_mongdb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
