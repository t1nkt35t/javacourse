package com.example.javacourse2.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Student st1 = new Student("Poop", 'm', 21, 3, 5.5);
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

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        myStream.filter(st -> st.getAge()>20 && st.getAvgGrade()<7.1).collect(Collectors.toList());

        List<Student> listy = stl.stream().filter(st -> st.getAge()>20 && st.getAvgGrade()<7.1).collect(Collectors.toList());
        System.out.println(listy);
    }
}
