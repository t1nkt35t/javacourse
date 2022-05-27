package com.example.javacourse2.nio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathsAndFileEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path dirPath = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold");

        System.out.println(filePath.getFileName());
        System.out.println(dirPath.getFileName());
        System.out.println("-----------------------");
        System.out.println(filePath.getParent());
        System.out.println(dirPath.getParent());
        System.out.println("-----------------------");
        System.out.println(filePath.getRoot());
        System.out.println(dirPath.getRoot());
        System.out.println("-----------------------");
        System.out.println(filePath.isAbsolute());
        System.out.println(dirPath.isAbsolute());
        System.out.println("-----------------------");
        System.out.println(filePath.toAbsolutePath());
        System.out.println(dirPath.toAbsolutePath());
        System.out.println("-----------------------");
        System.out.println(filePath.toAbsolutePath().getParent());
        System.out.println(dirPath.toAbsolutePath().getRoot());
        System.out.println("-----------------------");
        System.out.println(dirPath.resolve(filePath));
        System.out.println("-----------------------");
        Path anotherPath = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold/1/2/3/test20.txt");

//        System.out.println(filePath.isAbsolute());
        System.out.println(dirPath.relativize(anotherPath));

        System.out.println("-----------------------");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(dirPath)) {
            Files.createDirectory(dirPath);
        }
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));
        System.out.println("-----------------------");
        Path filePath2 = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/test15.txt");
        System.out.println(Files.isSameFile(filePath, filePath2));
        System.out.println(Files.size(filePath));
        System.out.println("-----------------------");
        System.out.println(Files.getAttribute(filePath, "creationTime"));
        System.out.println(Files.getAttribute(filePath, "size"));
        Map<String, Object> atrrs = Files.readAttributes(filePath, "*");
        for(Map.Entry<String, Object> entry: atrrs.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
