package com.example.javacourse2.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
