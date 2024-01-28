package ru.geekbrains.SpringHW5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "task_name")
    private String task_name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "taskStatus", nullable = false)
    private TaskStatus taskStatus;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;
}
