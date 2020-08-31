package com.ojcfcl.workshop_springboot_mongdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ojcfcl.workshop_springboot_mongdb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
