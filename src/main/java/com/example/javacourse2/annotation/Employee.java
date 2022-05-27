package com.example.javacourse2.annotation;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@AllArgsConstructor
@ToString
public class Employee {
    String name;
    double salary;

    public void increaseSalary(){
        salary*=2;
    }
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{

}
