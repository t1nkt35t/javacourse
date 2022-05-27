package com.example.javacourse2.innerNested;

import lombok.*;

@Data
@RequiredArgsConstructor
@ToString
public class Car {
    @NonNull
    String color;
    @NonNull
    int doorCount;

    Engine engine;

    @ToString
    @AllArgsConstructor
    public class Engine {
        private int horsePower;

    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("red", 2);
        car.setEngine(car.new Engine(200));
        System.out.println(car);
        Car.Engine engine2 = new Car("red", 2).new Engine(134); //lost link to car
    }
}
