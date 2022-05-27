package com.example.javacourse2.reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    void subtract(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    void multiply(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    void divide(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Test10.txt"))) {
            String methodName = reader.readLine();
            String arg1 = reader.readLine();
            String arg2 = reader.readLine();
            Calculator calc = new Calculator();
            Class cl = calc.getClass();
            Method method = null;
            Method[] methods = cl.getDeclaredMethods();
            for (Method m : methods) {
                if (m.getName().equals(methodName)) {
                    method = m;
                }
            }
            method.invoke(calc, Integer.parseInt(arg1), Integer.parseInt(arg2));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
