package com.ojcfcl.workshop_springboot_mongdb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojcfcl.workshop_springboot_mongdb.domain.Post;
import com.ojcfcl.workshop_springboot_mongdb.repository.PostRepository;
import com.ojcfcl.workshop_springboot_mongdb.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
