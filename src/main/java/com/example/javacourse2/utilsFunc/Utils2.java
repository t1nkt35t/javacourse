package com.example.javacourse2.utilsFunc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Utils2 {

    public static void main(String[] args) {
        ArrayList<Car> cars = createCars(() -> new Car("Volvo", "Black", 2.4));
        System.out.println(cars);

        changeCar(cars.get(0), car -> {
            car.color = "red";
            car.engine = 2.2;
            car.model = "Opel";
            System.out.println(car);
        });
        System.out.println(cars);
    }

    public static ArrayList<Car> createCars(Supplier<Car> supplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(supplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}

@Data
@AllArgsConstructor
@ToString
class Car {
    String model;
    String color;
    double engine;
}
