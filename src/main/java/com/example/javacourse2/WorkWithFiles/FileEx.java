package com.example.javacourse2.WorkWithFiles;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("lololo.txt");
        File folder = new File("/Users/my3tahk/Downloads/Java/java-course2/fold");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println(file.exists());
        System.out.println(folder.exists());
    }
}
