package com.example.javacourse2.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("yo");
        list.add("wazza");
        list.add("yoyoyo");
        list.add("bye");

        List<Integer> list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5, 3, 9, 8, 1};
        array = Arrays.stream(array).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("hi");
        set.add("yo");
        set.add("wazza");
        set.add("yoyoyo");
        set.add("bye");

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
