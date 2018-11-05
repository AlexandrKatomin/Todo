package com.example.todo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "label")
public class Label extends BaseModel{

    @Column(name = "name")
    private String name;

    public Label(){}
}
