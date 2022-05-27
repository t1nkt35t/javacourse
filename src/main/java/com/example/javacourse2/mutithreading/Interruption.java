package com.example.javacourse2.mutithreading;

public class Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        Interruted interruted = new Interruted();
        interruted.start();
        Thread.sleep(2000);
        interruted.interrupt();
        interruted.join();
        System.out.println("Main ends");
    }
}

class Interruted extends Thread{
    double sqrtSum = 0;
    public void run(){
        for(int i = 1; i<=1000000000; i++){
            if(isInterrupted()){
                System.out.println("wanted to interrupt");
                return;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("WE WERE INTERRUPTED");
                System.out.println(sqrtSum);

                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
