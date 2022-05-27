package com.example.javacourse2.WorkWithFiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String imba = "Я летел над луной\n" +
                "Высотой умиляясь\n" +
                "Скрыто было, но всё ж\n" +
                "Упоенье достигнуто\n";

        String s = "YOOYOYO";

        FileWriter writer = null;
        try {
//            writer = new FileWriter("/Users/my3tahk/Downloads/Java/java-course2/src/main/java/com/example/javacourse2/WorkWithFiles/fw.txt");
            writer = new FileWriter("testtest.txt", true);
//            for (int i = 0; i < imba.length(); i++) {
//                writer.write(imba.charAt(i));
//                System.out.println(i);
//
//            }
            writer.write(s);
            System.out.println("БЫЛО");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }

    }
}
