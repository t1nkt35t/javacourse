package com.example.javacourse2.regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s =
                "Lol Kekov, Russia, Moscow, Mira street, 12, flat 21," +
                        "email: lolkekov@hui.com, Postcode: AA99, Phone Number: +123456789;" +
                        "Fuck Shitov, UK, London, Ulla street, 43, flat 11," +
                        "email: fuckshitov@noob.ru, Postcode: RUS99, Phone Number: +987654321;" +
                        "Hui Petrov, Egypt, Cairo, Redsea street, 13, flat 19," +
                        "email: huipetrov@hui.com, Postcode: EGP99, Phone Number: +345574676;";

        String s2 = "huipetrov@hui.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String [] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
