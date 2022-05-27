package com.example.javacourse2.scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx2 {
    public static void main(String[] args) {

        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader("/Users/my3tahk/Downloads/Java/java-course2/test135.txt"));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                set.add(scanner.next());
            }
            set.stream().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("trouble!!!");
            throw new RuntimeException(e);
        }
        finally {
            scanner.close();
        }
    }
}
