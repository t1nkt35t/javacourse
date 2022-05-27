package com.example.javacourse2.scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input:");
//        int i = scanner.nextInt();
//        System.out.println("number :" + i);
//                int i = scanner.nextInt();
//                int u = scanner.nextInt();
//        System.out.println("divide :" + i/u);
//        System.out.println("module :" + i%u);
//        System.out.println("input 2 words :");
//        String s = scanner.nextLine();
//        System.out.println("words are :" + s);
//        System.out.println("input double':");
//        double i = scanner.nextDouble();
//        System.out.println("number :" + i);
        Scanner scanner = new Scanner("lol kek cheburek\nlol kek cheburek\nlol kek cheburek");
        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
            System.out.println(scanner.next().charAt(2));
        }

    }
}
