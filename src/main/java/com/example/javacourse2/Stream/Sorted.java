package com.example.javacourse2.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        int[] ar = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        System.out.println(Arrays.toString(ar));

        int result = Arrays.stream(ar).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();
        ar = Arrays.stream(ar).sorted().toArray();
        System.out.println(result);


        Student st1 = new Student("Poopa", 'f', 21, 3, 5.5);
        Student st2 = new Student("Lool", 'm', 20, 1, 6.6);
        Student st3 = new Student("Noob", 'm', 19, 2, 7.2);
        Student st4 = new Student("Lola", 'f', 24, 5, 4.8);
        Student st5 = new Student("Klava", 'f', 22, 4, 7.5);
        List<Student> stl = new ArrayList<>();
        stl.add(st1);
        stl.add(st2);
        stl.add(st3);
        stl.add(st4);
        stl.add(st5);
//        stl = stl.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        stl = stl.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
//        System.out.println(stl);
//        stl.forEach(System.out::println);

        System.out.println(stl.stream().map(
                e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted(Comparator.comparing(Student::getAge))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
                .findFirst().get());

        List<Integer> courses = stl.stream().mapToInt(el->el.getCourse()).boxed().collect(Collectors.toList());

        System.out.println(stl.stream().mapToInt(el->el.getCourse()).average().getAsDouble());

        System.out.println(stl.stream().mapToInt(el->el.getCourse()).min().getAsInt());

        System.out.println(stl.stream().mapToInt(el->el.getCourse()).max().getAsInt());



    }
}
