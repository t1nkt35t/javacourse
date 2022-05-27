package com.example.javacourse2.Stream;

import java.util.stream.Stream;

public class ConcatDistinctCountPeak {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
        stream4.forEach(System.out::println);

//        stream.distinct().forEach(System.out::println);
//        System.out.println(stream.count());
//        System.out.println(stream.distinct().count());// can npt reuse
        System.out.println(stream.distinct().peek(System.out::println).count());// can not reuse
    }
}
