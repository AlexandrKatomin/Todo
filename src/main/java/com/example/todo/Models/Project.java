package com.example.todo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "project")
public class Project extends BaseModel {

    @Column(name = "name")
    private String name;

    public Project(){}
}
