package com.example.javacourse2.threadSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistEx {
    public static void main(String[] args) throws InterruptedException {
//        ArrayList<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Poop");
        list.add("Kek");
        list.add("Lal");
        list.add("Foo");
        list.add("Chunga");
        System.out.println(list);

        Runnable runnable1 = ()->{
            Iterator<String> iter= list.iterator();
            while(iter.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iter.next());
            }
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Dude");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
