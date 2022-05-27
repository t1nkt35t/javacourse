package com.example.javacourse2.mutithreading;

public class NameAndPriority implements Runnable {
    public static void main(String[] args) {
//        Thread5 thread5 = new Thread5();
//        thread5.setName("my5");
//        thread5.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(thread5.getName());
//        System.out.println(thread5.getPriority());
        Thread thread = new Thread(new NameAndPriority());
        thread.start();
        System.out.println("MAIN " + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("RUN " + Thread.currentThread().getName());
    }
}

class Thread5 extends Thread {
    public void run() {
        System.out.println("YO");
    }
}