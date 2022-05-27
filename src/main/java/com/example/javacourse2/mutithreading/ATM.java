package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Lol", lock);
        new Employee("Kek", lock);
        new Employee("Boom", lock);
        Thread.sleep(5000);
        new Employee("Rama", lock);
        new Employee("Krishna", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if(lock.tryLock()) {
            try {
//            System.out.println(name + " awaits...");
//            lock.lock();
                System.out.println(name + " using...");
                Thread.sleep(2000);
                System.out.println(name + " finishing...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else{
            System.out.println(name + " getting away");
        }
    }
}

