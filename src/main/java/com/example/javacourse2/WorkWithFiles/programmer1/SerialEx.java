package com.example.javacourse2.WorkWithFiles.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialEx {
    public static void main(String[] args) {
        List<String> emps = new ArrayList<>();
        emps.add("Lol");
        emps.add("Kek");
        emps.add("Poop");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("emps1.bin"))

        ) {
            objectOutputStream.writeObject(emps);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
