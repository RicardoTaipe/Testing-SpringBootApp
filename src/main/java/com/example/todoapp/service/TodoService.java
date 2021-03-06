package com.example.todoapp.service;

import com.example.todoapp.domain.Todo;
import com.example.todoapp.respository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public Optional<List<Todo>> getTodos() {
        return Optional.of(todoRepository.findAll());
    }

    public Optional<Todo> getTodo(Integer id) {
        return todoRepository.findById(id);
    }

    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(Integer id) {
        todoRepository.deleteById(id);
    }
}
