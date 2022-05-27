package com.example.javacourse2;

import java.util.Set;
import java.util.TreeSet;

public class HashSetEX {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student st1 = new Student("Lol", "Kekov", 2);
        Student st2 = new Student("Poop", "Fackoff", 4);
        Student st3 = new Student("Jul", "Burn", 5);
        Student st4 = new Student("Noob", "Titen", 3);
        Student st5 = new Student("Zhop", "Puka", 1);
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);
        Student st6 = new Student("Boba", "Fet", 2);
        Student st7 = new Student("Rofa", "Deep", 4);

        System.out.println(ts.subSet(st6, st7));
        System.out.println(st6.equals(st1));
        System.out.println(st1.hashCode()==st6.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st6.hashCode());
    }

}
