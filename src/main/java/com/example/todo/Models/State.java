package com.example.todo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "state")
public class State extends BaseModel {

    @Column(name = "name")
    private String name;

    public State(){}
}
