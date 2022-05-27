package com.example.javacourse2.mutithreading;

public class SynchronizedMethodsOnSameObject {
    static final Object lock = new Object();
    void mobileCall() {
//        synchronized (SyncObject.class) {
        synchronized (lock) {
            System.out.println("Mobile starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile ends");
        }
    }

    void skypeCall() {
//        synchronized (SyncObject.class) {
        synchronized (lock) {
            System.out.println("skype starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype ends");
        }
    }

    void telegramCall() {
//        synchronized (SyncObject.class) {
        synchronized (lock) {
            System.out.println("telegram starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("telegram ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MobileRun());
        Thread thread2 = new Thread(new SkypeRun());
        Thread thread3 = new Thread(new TelegramRun());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MobileRun implements Runnable {

    @Override
    public void run() {
        new SynchronizedMethodsOnSameObject().mobileCall();
    }
}

class SkypeRun implements Runnable {

    @Override
    public void run() {
        new SynchronizedMethodsOnSameObject().skypeCall();
    }
}

class TelegramRun implements Runnable {

    @Override
    public void run() {
        new SynchronizedMethodsOnSameObject().telegramCall();
    }
}

class SyncObject {

}
