package com.example.javacourse2.staticNested;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Car {
    String color;
     int doorCount;
    Engine engine;
    static int a;

    @AllArgsConstructor
    @ToString
    public static class Engine{
        int horsePower;

    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e);
        Car car = new Car("red", 2, e);
        System.out.println(car);
    }
}
