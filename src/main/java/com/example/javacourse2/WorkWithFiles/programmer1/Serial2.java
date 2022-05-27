package com.example.javacourse2.WorkWithFiles.programmer1;

import java.io.*;

public class Serial2 {
    public static void main(String[] args) {
        Emps emps = new Emps("Lola","Kek", "IT",  500, new Car("volvo", "red"));
//        Emps emps = new Emps("Lola", "IT", 28, 500, new Car("volvo", "red"));
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("emps2.bin"))) {
            objectOutputStream.writeObject(emps);
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
