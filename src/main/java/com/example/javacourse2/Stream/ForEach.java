package com.example.javacourse2.Stream;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 8, 1};
//        Arrays.stream(array).forEach(el -> {
//            el *= 2;
//            System.out.println(el);
//        });
//        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Util::myMethod);
    }
}

class Util{
    public static void myMethod(int i){
        i +=5;
        System.out.println("element = " + i);
    }
}
