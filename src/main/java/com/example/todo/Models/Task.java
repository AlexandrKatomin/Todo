package com.example.todo.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "task")
public class Task extends BaseModel{

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "datebegin")
    private Date dateBegin;

    @Column(name = "dateend")
    private Date dateEnd;

    public Task(){}
}
