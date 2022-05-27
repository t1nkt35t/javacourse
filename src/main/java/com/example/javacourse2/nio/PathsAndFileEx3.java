package com.example.javacourse2.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathsAndFileEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test135.txt");
//        Files.createFile(filePath);
//        String dialog = "Zdr!\nZdr\nPoshel ty!\nSam kedar!";
//        Files.write(filePath, dialog.getBytes());
        List<String> list = Files.readAllLines(filePath);
        for(String s: list){
            System.out.println(s);
        }
    }
}
