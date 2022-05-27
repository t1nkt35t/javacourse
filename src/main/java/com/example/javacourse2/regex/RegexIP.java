package com.example.javacourse2.regex;

import java.util.regex.Pattern;

public class RegexIP {
    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        RegexIP regexIp = new RegexIP();
        regexIp.checkIp(ip1);
        regexIp.checkIp(ip2);
    }

    void checkIp(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + Pattern.matches(regex, ip));
    }
}
