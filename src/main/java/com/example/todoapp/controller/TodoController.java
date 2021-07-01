package com.example.todoapp.controller;

import com.example.todoapp.domain.Todo;
import com.example.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> getTodos() {
        Optional<List<Todo>> todos = todoService.getTodos();
        return todos.isPresent()
                ? ResponseEntity.ok(todos.get())
                : ResponseEntity.notFound().build();
    }

    @GetMapping("{todoId}")
    public void getTodoById(@PathVariable int todoId){
        
    }
}
