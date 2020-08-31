package com.ojcfcl.workshop_springboot_mongdb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojcfcl.workshop_springboot_mongdb.domain.Post;
import com.ojcfcl.workshop_springboot_mongdb.service.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResources {

	@Autowired
	private PostService service;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
