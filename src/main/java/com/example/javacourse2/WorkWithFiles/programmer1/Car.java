package com.example.javacourse2.WorkWithFiles.programmer1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@Data
public class Car implements Serializable {
    String model;
    String color;
}
