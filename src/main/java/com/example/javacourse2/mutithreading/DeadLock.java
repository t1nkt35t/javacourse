package com.example.javacourse2.mutithreading;

public class DeadLock {
    public static final Object lock = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        T10 t10 = new T10();
        T20 t20 = new T20();
        t10.start();
        t20.start();
    }
}

class T10 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread() + " try to capture lock1");
        synchronized (DeadLock.lock){
            System.out.println(Thread.currentThread() + " lock1 captured");
            System.out.println(Thread.currentThread() + " try to capture lock2");
            synchronized (DeadLock.lock2){
                System.out.println(Thread.currentThread() + " lock1 & lock2 captured");
            }
        }
    }
}
class T20 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread() + " try to capture lock2");
//        synchronized (DeadLock.lock2){
        synchronized (DeadLock.lock){
            System.out.println(Thread.currentThread() + " lock1 captured");
            System.out.println(Thread.currentThread() + " try to capture lock2");
//            synchronized (DeadLock.lock){
            synchronized (DeadLock.lock2){
                System.out.println(Thread.currentThread() + " lock1 & lock2 captured");
            }
        }
    }
}
