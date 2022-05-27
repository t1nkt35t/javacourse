package com.example.javacourse2.nio;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTreeEx {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold2");
        Files.walkFileTree(path, new MySimpleFileVisitor1());
    }
}

class MySimpleFileVisitor1 extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("filename : " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("delete dir : " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}