package com.example.javacourse2.mutithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntEx {
    //    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger();

    public static void increment() {
//        counter++;
//        counter.incrementAndGet();
        counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunImpl());
        Thread thread2 = new Thread(new MyRunImpl());
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(counter);
    }
}

class MyRunImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntEx.increment();
        }
    }
}