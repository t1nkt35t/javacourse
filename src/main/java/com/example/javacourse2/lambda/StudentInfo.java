package com.example.javacourse2.lambda;

import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentInfo {
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
//        new StudentInfo().testStudents(stl, new CheckByGrade());
//        new StudentInfo().testStudents(stl, new StudentChecks() {
//            @Override
//            public boolean checkStudent(Student s) {
//                return s.age < 22;
//            }
//        });

//        new StudentInfo().testStudents(stl, (Student s) -> {return s.avgGrade > 6;});
//        System.out.println();
//
//        new StudentInfo().testStudents(stl, (Student s) -> {return s.age < 22;});
//        System.out.println();
        StudentInfo info = new StudentInfo();

//        StudentChecks2 sc = p -> p.age > 20;
//        info.testStudents2(stl, sc);
//        new StudentInfo().testStudents(stl, (s, i) -> s.age < 25 && s.avgGrade < 6 && s.sex == 'f');

        Collections.sort(stl, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });

        Collections.sort(stl, (stu1, stu2) -> st1.course-st2.course);
        System.out.println(stl);
//        new StudentInfo().testStudents(stl, (Student s) -> s.age < 22);
//        StudentInfo info = new StudentInfo();
//        info.filterByGrade(stl, 6);
//        System.out.println();
//        info.filterByAge(stl, 22);
//        System.out.println();
//
//        info.filterByCondition(stl, 20, 7, 'f');
    }

    void testStudents(ArrayList<Student> als, StudentChecks sc) {
        for (Student s : als) {
            if (sc.checkStudent(s, 0)) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    void testStudents2(ArrayList<Student> als, StudentChecks2 sc) {
        for (Student s : als) {
            if (sc.checkStudent(s)) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public void testStudents() {
    }

//    void filterByGrade(ArrayList<Student> stl, double grade) {
//        for (Student st : stl) {
//            if (st.avgGrade > grade) {
//                System.out.println(st);
//            }
//        }
//    }
//
//    void filterByAge(ArrayList<Student> stl, double age) {
//        for (Student st : stl) {
//            if (st.age < age) {
//                System.out.println(st);
//            }
//        }
//    }
//
//    void filterByCondition(ArrayList<Student> stl, int age, double grade, char sex) {
//        for (Student st : stl) {
//            if (st.age > age && st.avgGrade > grade && st.sex==sex) {
//                System.out.println(st);
//            }
//        }
//    }

}

interface StudentChecks {
    boolean checkStudent(Student s, int i);
}

interface StudentChecks2 {
    boolean checkStudent(Student s);
}

interface I {
    int abc(String s);
}

//class CheckByGrade implements StudentChecks {
//
//    @Override
//    public boolean checkStudent(Student s) {
//        return s.avgGrade > 7;
//    }

