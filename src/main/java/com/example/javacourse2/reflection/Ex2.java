package com.example.javacourse2.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class empClass = Class.forName("com.example.javacourse2.reflection.Employee");
        Constructor<Employee> constructor1 = empClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor<Employee> constructor2 = empClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Lol", "IT");
        System.out.println(obj2);

        Method method = empClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);



    }
}
