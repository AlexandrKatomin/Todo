package com.example.todo.Controllers;

import com.example.todo.Models.Task;
import com.example.todo.Services.Abstract.IBaseService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {
    private final IBaseService<Task> taskService;

    @GetMapping(value = "/task")
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = this.taskService.getAll();

        return ResponseEntity.ok().body(tasks);
    }
}
