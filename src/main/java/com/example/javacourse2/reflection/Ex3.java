package com.example.javacourse2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Employee employee = new Employee(5, "Lol", "IT");
        Class empClass = employee.getClass();
        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryVal = (Double) field.get(employee);
        System.out.println(salaryVal);
        field.set(employee, 1200);
        System.out.println(employee);




    }
}
