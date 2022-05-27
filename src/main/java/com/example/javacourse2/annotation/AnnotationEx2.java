package com.example.javacourse2.annotation;

import java.lang.annotation.*;

public class AnnotationEx2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("com.example.javacourse2.annotation.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation from Xiaomi class: "
                + sm1.OS() + ", " + sm1.yearOfCompany());

        Class iphoneClass = Class.forName("com.example.javacourse2.annotation.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation from Iphone class: "
                + sm2.OS() + ", " + sm2.yearOfCompany());
//        Annotation from Xiaomi class: Android, 2010
//        Annotation from Iphone class: IOS, 1976
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int yearOfCompany() default 2010;
}

@SmartPhone
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompany = 1976)
class Iphone {
    String model;
    double price;
}