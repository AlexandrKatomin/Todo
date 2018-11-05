package com.example.todo.Services.Concreate;

import com.example.todo.Models.BaseModel;
import com.example.todo.Models.Task;
import com.example.todo.Repositories.BaseRepository;
import com.example.todo.Services.Abstract.IBaseService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class BaseService<T extends BaseModel, K extends BaseRepository<T>> implements IBaseService<T> {
    protected final K repository;

    @Override
    public void createOrUpdate(T model) {
        this.repository.saveAndFlush(model);
    }

    @Override
    public List<T> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Page<Task> getPage(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<T> get(int id) {
       return this.repository.findById(id);
    }

    @Override
    public void deleteBy(int id) {
        this.repository.deleteById(id);
    }
}
