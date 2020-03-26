package com.task.nerdysoft.service;

import com.task.nerdysoft.model.Task;
import java.util.List;

public interface TaskService {

    void create(Task task);

    List<Task> findAll();
}
