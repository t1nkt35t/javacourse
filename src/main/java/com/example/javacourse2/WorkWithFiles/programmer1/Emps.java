package com.example.javacourse2.WorkWithFiles.programmer1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@Data
public class Emps implements Serializable {
//    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
//    int age;
    transient double salary;
    Car car;
}
