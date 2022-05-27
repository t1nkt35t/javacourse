package com.example.javacourse2.WorkWithFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("testtest.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println(character);
            }
            System.out.println();
            System.out.println("БЫЛО");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
