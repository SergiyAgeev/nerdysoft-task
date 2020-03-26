package com.task.nerdysoft.model;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "tasks")
public class Task {
    @MongoId
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Indexed
    private String title;
    private String description;
    private Date taskCreationDate;

    @DBRef
    private User author;

}
