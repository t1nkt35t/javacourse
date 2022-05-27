package com.example.javacourse2;

import java.util.*;

public class LHS {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(3);
        d.addFirst(5);
        d.addLast(7);
        d.offerFirst(1);
        d.offerLast(8);
//        Student st1 = new Student("Lol", "Kekov", 2);
//        Student st2 = new Student("Poop", "Fackoff", 4);
//        Student st3 = new Student("Jul", "Burn", 5);
//        Student st4 = new Student("Noob", "Titen", 3);
//        Student st5 = new Student("Zhop", "Puka", 1);
//        pq.add(st1);
//        pq.add(st2);
//        pq.add(st3);
//        pq.add(st4);
//        pq.add(st5);
//        System.out.println(pq.remove());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//

        System.out.println(d);
        System.out.println(d.removeFirst());
        System.out.println(d.removeLast());
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
        System.out.println(d);
    }

}
