package com.example.javacourse2.threadSafe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        System.out.println(queue);
        //PRODUCER
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.put(++i);
                    System.out.println("Prod added " + i + " " + queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //CONSUMER
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Cons taken " + j + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
