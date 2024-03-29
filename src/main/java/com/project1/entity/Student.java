package com.project1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Student {
    private long id;
    private String name;
    private int age;
    private List<Address> address;

    public Student(){
        System.out.println("创建了Student");
    }
}
