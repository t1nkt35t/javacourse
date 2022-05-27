package com.example.javacourse2.utilsFunc;


import java.util.ArrayList;
import java.util.function.Predicate;

public class Utils {
    public static void main(String[] args) {
        Student st1 = new Student("Poop", 'm', 21, 3, 4.5);
        Student st2 = new Student("Lool", 'm', 20, 1, 6.6);
        Student st3 = new Student("Noob", 'm', 19, 2, 7.2);
        Student st4 = new Student("Lola", 'f', 24, 5, 4.8);
        Student st5 = new Student("Klava", 'f', 22, 4, 7.5);
        ArrayList<Student> stl = new ArrayList<>();
        stl.add(st1);
        stl.add(st2);
        stl.add(st3);
        stl.add(st4);
        stl.add(st5);

        Utils inf = new Utils();
        Predicate<Student> sc1 = p -> p.age > 20;
        Predicate<Student> sc2 = p -> p.course > 3;
        Predicate<Student> sc3 = p -> p.age > 20 && p.avgGrade < 7 && p.sex == 'f';
        inf.testStudents(stl, sc1.negate().or(sc3));
    }

    void testStudents(ArrayList<Student> als, Predicate<Student> pr) {
        for (Student s : als) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
        System.out.println("--------------");
    }

}



