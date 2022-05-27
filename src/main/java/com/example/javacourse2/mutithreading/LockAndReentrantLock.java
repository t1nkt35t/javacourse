package com.example.javacourse2.mutithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndReentrantLock {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.telegramCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("mobile start");
            Thread.sleep(3000);
            System.out.println("mobile end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            {
                lock.unlock();
            }
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("skype start");
            Thread.sleep(5000);
            System.out.println("skype end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            {
                lock.unlock();
            }
        }
    }

    void telegramCall() {
        lock.lock();
        try {
            System.out.println("telega start");
            Thread.sleep(7000);
            System.out.println("telega end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            {
                lock.unlock();
            }
        }
    }
}
