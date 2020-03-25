package com.task.nerdysoft.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "users")
public class User {
    @Id
    private Long id;
    @Indexed
    private String username;
    @Indexed
    private String email;
    private String password;

    private String name;
    private String secondName;
    private Integer age;

    @DBRef
    private List<Task> taskList;

}
