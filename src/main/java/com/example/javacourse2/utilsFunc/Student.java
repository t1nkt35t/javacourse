package com.example.javacourse2.utilsFunc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
}
