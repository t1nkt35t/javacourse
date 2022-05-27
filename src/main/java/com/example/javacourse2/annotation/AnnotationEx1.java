package com.example.javacourse2.annotation;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class AnnotationEx1 {
    public static void main(String[] args) {
        Parent p = new Child("Lol");
        p.showInfo();
    }
}

@RequiredArgsConstructor
class Parent {
    @NonNull
    String name;

    void showInfo() {
        System.out.println("parent class " + name);
    }
}

class Child extends Parent {

    public Child(@NonNull String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("child class " + name);

    }
}
