package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial1 = new Factorial1(8);
        Future<Integer> future = executorService.submit(factorial1);
        try {
            System.out.println(future.isDone());
            System.out.println("WANT RESULT");
            factorialResult= future.get();
            System.out.println("GOT RESULT");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

@AllArgsConstructor
class Factorial1 implements Callable<Integer> {
    int f;

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("WRONG NUMBER");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}