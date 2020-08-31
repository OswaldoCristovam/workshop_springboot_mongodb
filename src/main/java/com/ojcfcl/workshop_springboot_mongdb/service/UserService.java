package com.ojcfcl.workshop_springboot_mongdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojcfcl.workshop_springboot_mongdb.domain.User;
import com.ojcfcl.workshop_springboot_mongdb.repository.UserRepository;
import com.ojcfcl.workshop_springboot_mongdb.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
