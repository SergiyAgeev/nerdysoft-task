package com.task.nerdysoft.repository;

import com.task.nerdysoft.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskMongoRepository extends MongoRepository<Task, String> {
}
