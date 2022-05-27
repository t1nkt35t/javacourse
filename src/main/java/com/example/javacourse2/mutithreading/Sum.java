package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sum {
    private static long val = 1_000_000_000;
    private static long sum = 0;

    public static void main(String[] args)throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valDivByTen = val / 10;
        for (int i = 0; i < 10; i++) {
            long from = valDivByTen * i + 1;
            long to = valDivByTen * (i + 1);
            PartialSum partialSum = new PartialSum(from, to);
            Future<Long> futPartSum = executorService.submit(partialSum);
            futureResults.add(futPartSum);
        }
//        futureResults.stream().reduce((accumulator, l) -> accumulator+=l.get());   //how to
        for (Future<Long> result : futureResults) {
            sum += result.get();
        }
        executorService.shutdown();
        System.out.println(sum);
    }
}

@RequiredArgsConstructor
class PartialSum implements Callable<Long> {
    @NonNull
    long from;
    @NonNull
    long to;
    long localSum;

    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }

}
