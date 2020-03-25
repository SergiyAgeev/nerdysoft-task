package com.task.nerdysoft.repository;

import com.task.nerdysoft.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, String> {
}
