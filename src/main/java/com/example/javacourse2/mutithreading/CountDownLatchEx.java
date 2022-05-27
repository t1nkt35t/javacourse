package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStuffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("STUFF READY");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("EVERYTHING is  READY");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("MARKET OPEN");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Lol", countDownLatch);
        new Friend("Pop", countDownLatch);
        new Friend("Sol", countDownLatch);
        new Friend("Fel", countDownLatch);
        new Friend("Kal ", countDownLatch);
        marketStuffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " started shopping");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
