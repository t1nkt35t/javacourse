package com.example.javacourse2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String s1 =
                "12345678912345670325876;" +
                "12345438912345670324576;" +
                "12345483647545670723016;";

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s1);

//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);

        while(matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
