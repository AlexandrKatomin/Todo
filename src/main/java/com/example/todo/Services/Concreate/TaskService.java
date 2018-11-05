package com.example.todo.Services.Concreate;

import com.example.todo.Models.Task;
import com.example.todo.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TaskService")
public class TaskService extends BaseService<Task, TaskRepository> {

    public TaskService(TaskRepository repository) {
        super(repository);
    }
}
