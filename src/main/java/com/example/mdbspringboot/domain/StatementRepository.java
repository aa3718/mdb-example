package com.example.mdbspringboot.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface StatementRepository extends MongoRepository<Statement, String> {

	@Query("{id: '?0'}")
	Statement findItemById(String id);



}
