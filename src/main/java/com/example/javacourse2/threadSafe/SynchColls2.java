package com.example.javacourse2.threadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchColls2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(list);
        Runnable runnable1 = () -> {
            synchronized (synchList) {
                Iterator<Integer> iter = synchList.iterator();
                while (iter.hasNext()) {
                    System.out.println(iter.next());
                }
            }
        };
        Runnable runnable2 = () -> synchList.remove(10);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }

}
