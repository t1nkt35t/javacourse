package com.example.javacourse2.mutithreading;

public class Daemon {
    public static void main(String[] args) {
        System.out.println("Main starts");
        UserThread userThread = new UserThread();
        userThread.setName("userThread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemonThread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main ends");
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(200);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
