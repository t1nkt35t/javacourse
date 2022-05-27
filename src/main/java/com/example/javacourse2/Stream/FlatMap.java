package com.example.javacourse2.Stream;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Poopa", 'f', 21, 3, 5.5);
        Student st2 = new Student("Lool", 'm', 20, 1, 6.6);
        Student st3 = new Student("Noob", 'm', 19, 2, 7.2);
        Student st4 = new Student("Lola", 'f', 24, 5, 4.8);
        Student st5 = new Student("Klava", 'f', 22, 4, 7.5);
//        List<Student> stl = new ArrayList<>();
//        stl.add(st1);
//        stl.add(st2);
//        stl.add(st3);
//        stl.add(st4);
//        stl.add(st5);
        Faculty f1 = new Faculty("it");
        Faculty f2 = new Faculty("math");
        f1.addStToFuc(st1);
        f1.addStToFuc(st2);
        f1.addStToFuc(st3);
        f2.addStToFuc(st4);
        f2.addStToFuc(st5);

        List<Faculty> facList = new ArrayList<>();
        facList.add(f1);
        facList.add(f2);
        facList.stream().flatMap(faculty -> faculty.getStOnFac().stream()).forEach(System.out::println);
    }
}

@Data
@RequiredArgsConstructor
@ToString
class Faculty{
    @NonNull
    String name;
    List<Student> stOnFac = new ArrayList<>();

    public void addStToFuc(Student st){
        stOnFac.add(st);
    }
}
