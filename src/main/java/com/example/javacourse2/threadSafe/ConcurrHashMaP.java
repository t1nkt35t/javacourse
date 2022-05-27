package com.example.javacourse2.threadSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrHashMaP {
    public static void main(String[] args) throws InterruptedException {
//        HashMap<Integer, String> map = new HashMap<>();
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "lol");
        map.put(2, "Poop");
        map.put(3, "Kek");
        map.put(4, "Chuck");
        map.put(5, "Lee");
        System.out.println(map);
        Runnable runnable1 = () -> {
            Iterator<Integer> iter = map.keySet().iterator();
            while (iter.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iter.next();
                System.out.println(i + ":" + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "BOBA");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
