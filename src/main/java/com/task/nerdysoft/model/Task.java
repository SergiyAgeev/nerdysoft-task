package com.task.nerdysoft.model;

import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Document(collation = "tasks")
public class Task {
    @Id
    private Long id;

    private String title;
    private String description;

    @DateTimeFormat
    private Date taskCreationDate;

    @DBRef
    private User author;

}
