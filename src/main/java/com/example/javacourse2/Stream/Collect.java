package com.example.javacourse2.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        Student st1 = new Student("Poopa", 'f', 21, 4, 5.5);
        Student st2 = new Student("Lool", 'm', 20, 1, 6.6);
        Student st3 = new Student("Noob", 'm', 19, 2, 8.2);
        Student st4 = new Student("Lola", 'f', 24, 5, 4.8);
        Student st5 = new Student("Klava", 'f', 22, 4, 7.5);
        List<Student> stl = new ArrayList<>();
        stl.add(st1);
        stl.add(st2);
        stl.add(st3);
        stl.add(st4);
        stl.add(st5);

//        Map<Integer, List<Student>> map = stl.stream().map(el -> {
//                    el.setName(el.getName().toUpperCase());
//                    return el;
//                }
//        ).collect(Collectors.groupingBy(el -> el.getCourse()));
//        map.entrySet().forEach(System.out::println);

        stl.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7)).entrySet().forEach(System.out::println);


    }
}
