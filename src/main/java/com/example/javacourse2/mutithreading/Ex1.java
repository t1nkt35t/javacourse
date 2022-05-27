package com.example.javacourse2.mutithreading;

public class Ex1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();

        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());

    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

class MyThread3 implements Runnable {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }

}


