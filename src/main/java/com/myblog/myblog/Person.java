package com.myblog.myblog;

import lombok.Data;

import java.util.Arrays;

@Data
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name,int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
