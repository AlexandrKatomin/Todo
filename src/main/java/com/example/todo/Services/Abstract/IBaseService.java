package com.example.todo.Services.Abstract;

import com.example.todo.Models.BaseModel;
import com.example.todo.Models.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T extends BaseModel> {

    void createOrUpdate(T model);

    List<T> getAll();

    Page<Task> getPage(Pageable pageable);

    Optional<T> get (int id);

    void deleteBy(int id);
}
