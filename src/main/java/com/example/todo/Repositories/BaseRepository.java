package com.example.todo.Repositories;

import com.example.todo.Models.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends BaseModel> extends JpaRepository<T, Integer> {
}
