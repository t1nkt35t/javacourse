package com.example.javacourse2.utilsFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLearn {
    public static void main(String[] args) {
        Student st1 = new Student("Poop", 'm', 21, 3, 5.5);
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

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avg(stl, student -> student.avgGrade);
        double res2 = avg(stl, student -> (double)student.course);
        double res3 = avg(stl, student -> (double)student.age);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }

    private static double avg(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}
