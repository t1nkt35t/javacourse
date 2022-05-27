package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

@AllArgsConstructor
class Factorial implements Runnable {

    int f;

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("WRONG NUMBER");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        RunnableFactorial.factorialResult = result;
    }
}