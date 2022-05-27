package com.example.javacourse2.mutithreading;

public class  ThreadSleep extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRun());
        ThreadSleep thread2 = new ThreadSleep();
        System.out.println(thread1.getState() + " " + thread2.getState());
        thread1.start();
        thread2.start();
        System.out.println(thread1.getState() + " " + thread2.getState());
        thread1.join();
        thread2.join(1500);
        System.out.println(thread1.getState() + " " + thread2.getState());
        System.out.println("FIN");
    }

    public void run() {
        for (int i = 5; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
