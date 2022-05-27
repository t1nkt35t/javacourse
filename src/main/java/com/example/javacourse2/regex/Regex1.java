package com.example.javacourse2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s =
                        "Lol Kekov, Russia, Moscow, Mira street, 12, flat 21," +
                        "email: lolkekov@hui.com, Postcode: AA99, Phone Number: +123456789;" +
                        "Fuck Shitov, UK, London, Ulla street, 43, flat 11," +
                        "email: fuckshitov@noob.ru, Postcode: RUS99, Phone Number: +987654321;" +
                        "Hui Petrov, Egypt, Cairo, Redsea street, 13, flat 19," +
                        "email: huipetrov@hui.com, Postcode: EGP99, Phone Number: +345574676;";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
