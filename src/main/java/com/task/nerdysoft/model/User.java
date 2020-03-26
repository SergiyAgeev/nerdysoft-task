package com.task.nerdysoft.model;

import java.util.List;
import javax.persistence.Column;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "users")
public class User {
    @MongoId
    private String id;
    @Indexed
    @Column(unique = true)
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
