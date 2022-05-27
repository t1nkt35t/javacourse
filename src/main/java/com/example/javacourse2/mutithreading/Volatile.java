package com.example.javacourse2.mutithreading;

public class Volatile extends Thread {
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile thread = new Volatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("wake");
        thread.b = false;
        thread.join();
        System.out.println("End");
    }
}
