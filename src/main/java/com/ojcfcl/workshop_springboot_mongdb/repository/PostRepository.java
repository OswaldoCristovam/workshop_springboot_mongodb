package com.ojcfcl.workshop_springboot_mongdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ojcfcl.workshop_springboot_mongdb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
