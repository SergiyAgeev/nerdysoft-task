package com.task.nerdysoft;

import com.task.nerdysoft.model.Task;
import com.task.nerdysoft.service.TaskService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NerdysoftTaskApplication implements CommandLineRunner {

    private final TaskService taskService;

    @Autowired
    public NerdysoftTaskApplication(TaskService taskService) {
        this.taskService = taskService;
    }

    public static void main(String[] args) {
        SpringApplication.run(NerdysoftTaskApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Task task = new Task();
        task.setDescription("123");
        task.setTitle("0000");
        task.setTaskCreationDate(new Date());
        taskService.create(task);
        System.out.println(taskService.findAll());
    }
}
