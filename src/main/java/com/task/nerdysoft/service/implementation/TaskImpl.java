package com.task.nerdysoft.service.implementation;

import com.task.nerdysoft.model.Task;
import com.task.nerdysoft.repository.TaskMongoRepository;
import com.task.nerdysoft.service.TaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskImpl implements TaskService {
    private final TaskMongoRepository taskMongoRepository;

    @Autowired
    public TaskImpl(TaskMongoRepository taskMongoRepository) {
        this.taskMongoRepository = taskMongoRepository;
    }

    @Override
    public void create(Task task) {
        taskMongoRepository.save(task);
    }

    @Override
    public List<Task> findAll() {
        return taskMongoRepository.findAll();
    }
}
