package com.example.javacourse2.mutithreading;

public class SunchronizedBlock {
    public static void main(String[] args) throws InterruptedException {

        MRun mRun = new MRun();
        Thread thread1 = new Thread(mRun);
        Thread thread2 = new Thread(mRun);
        Thread thread3 = new Thread(mRun);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    volatile static int counter = 0;

}

class MRun implements Runnable {
    private void doWork2(){
        System.out.println("EEEEEE");
    }
    public void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.counter++;
            System.out.println(Counter2.counter);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}

