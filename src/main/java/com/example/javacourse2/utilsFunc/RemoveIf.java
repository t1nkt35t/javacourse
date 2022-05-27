package com.example.javacourse2.utilsFunc;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Booo");
        al.add("Laaal");
        al.add("Keeek");
        al.add("FUUUCk");
        al.add("Bombom");
        al.removeIf(element -> element.length() < 5);
        System.out.println(al);
    }
}
