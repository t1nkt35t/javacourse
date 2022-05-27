package com.example.javacourse2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class empClass = Class.forName("com.example.javacourse2.reflection.Employee");
//        Class empClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class empClass3 = emp.getClass();
        Field someField = empClass.getField("id");
        System.out.println(someField.getType());
        System.out.println("---------------------------");

        Field[] fields = empClass.getFields();
        Arrays.stream(fields).forEach(f -> System.out.println(f.getName() + " " + f.getType()));
        System.out.println("---------------------------");
        Arrays.stream(empClass.getDeclaredFields()).forEach(f -> System.out.println(f.getName() + " " + f.getType()));
        System.out.println("---------------------------");

        Method someMethod1 = empClass.getMethod("setSalary", double.class);
        System.out.println(someMethod1.getReturnType());
        System.out.println(Arrays.toString(someMethod1.getParameterTypes()));
        Arrays.stream(empClass.getMethods()).forEach(m -> System.out.println(m.getName()
                + " " + m.getReturnType()
                + " " + Arrays.toString(m.getParameterTypes())));
        System.out.println("---------------------------");

        Arrays.stream(empClass.getDeclaredMethods()).forEach(m -> System.out.println(m.getName()
                + " " + m.getReturnType()
                + " " + Arrays.toString(m.getParameterTypes())));

        System.out.println("---------------------------");

        Arrays.stream(empClass.getDeclaredMethods()).forEach(m -> {
            if (Modifier.isPublic(m.getModifiers())) {
                System.out.println(m.getName()
                        + " " + m.getReturnType()
                        + " " + Arrays.toString(m.getParameterTypes()));
            }
        });

        System.out.println("---------------------------");
        Constructor constructor1 = empClass.getConstructor();
        System.out.println(constructor1.getParameterCount());
        System.out.println(Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("---------------------------");
        Constructor constructor2 = empClass.getConstructor(int.class, String.class, String.class);
        System.out.println(constructor2.getParameterCount());
        System.out.println(Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("---------------------------");
        Arrays.stream(empClass.getConstructors()).forEach(c->{
            System.out.println(c.getName() + " "
            + c.getParameterCount() + " "
            + Arrays.toString(c.getParameterTypes()));
        });

    }
}
