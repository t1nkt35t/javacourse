package com.example.javacourse2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

//@SpringBootApplication
public class JavaCourse2Application {

    public static void main(String[] args) {
//        LinkedHashMap<Double, Student> ht = new LinkedHashMap<>
//                (16, 0.75f, false);
        Student st1 = new Student("Lol", "Kekov", 2);
        Student st2 = new Student("Poop", "Fackoff", 4);
        Student st3 = new Student("Jul", "Burn", 5);
        Student st4 = new Student("Noob", "Titen", 3);
//        Student st5 = new Student("Ralf", "Huyalf", 2);
//        Student st6 = new Student("Joop", "Zhopov", 1);
//        Student st7 = new Student("Vek", "Glazov", 2);
//        Student st8 = new Student("Lol", "Kekov", 2);
//        ht.put(st1, 5.8);
//        ht.put(st2, 5.6);
//        ht.put(st3, 1.8);
//        ht.put(st4, 2.8);
//        ht.put(st5, 2.2);
//        ht.put(st6, 3.8);
//        ht.put(st7, 6.4);
//        ht.put(5.6, st2);
//        ht.put(5.8, st1);
//        ht.put(6.4, st7);
//        ht.put(6.9, st8);

//        for (Object st : ht.entrySet()) {
//            System.out.println(st);
        }
//        System.out.println(ht.get(5.6) );
//        System.out.println(ht.headMap(5.0));
    }



@Data
@ToString
@AllArgsConstructor
class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course; //&& Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);//, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
    }
}
