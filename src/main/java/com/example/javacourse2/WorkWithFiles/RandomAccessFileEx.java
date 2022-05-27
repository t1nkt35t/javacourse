package com.example.javacourse2.WorkWithFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("Test10.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String a1= file.readLine();
            System.out.println(a1);
            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\t\tTHE END");
//            file.seek(25);
//            System.out.println(file.readLine());
//            System.out.println(file.getFilePointer());
//            file.writeBytes("lolololol");
//            System.out.println(file.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
