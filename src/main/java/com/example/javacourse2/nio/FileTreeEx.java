package com.example.javacourse2.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTreeEx {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold2");
        Files.walkFileTree(path, new MyFileVisitor());
    }
}

class MyFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("Entered dir : " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("filename : " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.out.println("error visiting file : " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("exited dir : " + dir);
        return FileVisitResult.CONTINUE;
    }
}
