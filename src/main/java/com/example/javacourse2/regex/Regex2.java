package com.example.javacourse2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

//        String s1 = "ABDOPABCOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e|5]");

//        String s1 = "!abcd!? abce++ ==abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W");

//        String s1 = "poka   abc    poop          dom       kino abstrakciya";
//        Pattern pattern1 = Pattern.compile("\\w\\S+\\w");

//        String s1 = "poka abce3 poop 78asasff6gfdgdf";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");

        String s1 = "DABCDABABABFADABABDHA";
        Pattern pattern1 = Pattern.compile("\\ADAB");

        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println(matcher.start()+ "  " + matcher.group());
        }
    }
}
