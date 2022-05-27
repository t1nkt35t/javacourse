package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private int bredCount = 0;

    public synchronized void getBread() {
        while (bredCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bredCount--;
        System.out.println("1 bread bought");
        System.out.println("bread quantity = " + bredCount);
        notify();
    }

    public synchronized void putBread() {
        while (bredCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        bredCount++;
        System.out.println("1 bread added");
        System.out.println("bread quantity = " + bredCount);
        notify();
    }
}

@AllArgsConstructor
class Producer implements Runnable {
    Market market;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

@AllArgsConstructor
class Consumer implements Runnable {
    Market market;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}

