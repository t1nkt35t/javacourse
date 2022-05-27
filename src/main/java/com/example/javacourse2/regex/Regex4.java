package com.example.javacourse2.regex;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Zdorova,       ebat       tya v sraku! Kak tboe nichego     Pidor";
        System.out.println(s1);
        System.out.println(s1.replace("Pidor", "Pivo"));
        System.out.println(s1.replaceAll(" {2,}", " "));
        System.out.println(s1.replaceAll("\\bt\\w+", "HUI"));
        System.out.println(s1.replaceFirst("\\bt\\w+", "HUI"));
    }
}
