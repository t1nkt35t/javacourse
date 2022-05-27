package com.example.javacourse2.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;

public class PathsAndFileEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path dirPath = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold");
        Path dirPath2 = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold2");

//        Files.copy(filePath, dirPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
////        Files.copy(filePath, dirPath.resolve("lol2.txt"));
//        Files.copy(dirPath2, dirPath.resolve(dirPath2.getFileName()));

//        Files.move(filePath, dirPath2.resolve("test15.txt"));
//        Files.move(Paths.get("Test3.txt"),  Paths.get("Test321.txt"));
//        Files.delete(Paths.get("testtest.txt"));
    }
}
