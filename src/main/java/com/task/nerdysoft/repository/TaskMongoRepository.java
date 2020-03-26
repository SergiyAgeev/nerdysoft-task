package com.task.nerdysoft.repository;

import com.task.nerdysoft.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskMongoRepository extends MongoRepository<Task, String> {

}
