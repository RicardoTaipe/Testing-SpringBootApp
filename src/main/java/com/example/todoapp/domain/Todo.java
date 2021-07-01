package com.example.todoapp.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean completed;
}
