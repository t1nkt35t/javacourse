package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        Person person1 = new Person("Lol", callBox);
        Person person2 = new Person("Kek", callBox);
        Person person3 = new Person("Poop", callBox);
        Person person4 = new Person("Jop", callBox);
        Person person5 = new Person("Fok", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " someone is calling");
            Thread.sleep(2000);
            System.out.println(name + " someone has ended");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
