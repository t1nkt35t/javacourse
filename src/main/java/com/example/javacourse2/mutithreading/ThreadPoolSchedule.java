package com.example.javacourse2.mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSchedule {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }
//        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}

class RunnableImpl200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begins");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "ends");

    }
}
