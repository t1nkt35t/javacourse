package com.example.javacourse2.nio;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTreeEx {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold2");
        Path destination = Paths.get("/Users/my3tahk/Downloads/Java/java-course2/fold");
        Files.walkFileTree(source, new MySimpleFileVisitor(source, destination));
    }
}

@Data
@AllArgsConstructor
class MySimpleFileVisitor extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Entered dir : " + dir);
        Path newDest = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDest, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("filename : " + file.getFileName());
        Path newDest = destination.resolve(source.relativize(file));
        Files.copy(file, newDest, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}