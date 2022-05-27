package com.example.javacourse2.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, el) -> accumulator * el).get();
        System.out.println(result);

        int result2 = list.stream().reduce(1,(accumulator, el) -> accumulator * el);
        System.out.println(result2);

////        List<Integer> list = new ArrayList<>();
//        Optional<Integer> o = list.stream().reduce((accumulator, el) -> accumulator * el);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("SHIT");
//        }

        List<String> list3 = new ArrayList<>();
        list3.add("yo");
        list3.add("peace");
        list3.add("da");
        list3.add("stradania");

        String resul3 = list3.stream().reduce((a,e) -> a + " " + e).get();
        System.out.println(resul3);
    }
}
