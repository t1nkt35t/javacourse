package com.example.javacourse2.WorkWithFiles.programmer2;

import com.example.javacourse2.WorkWithFiles.programmer1.Emps;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialEx2 {
    public static void main(String[] args) {
        Emps bestEmp;

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("emps2.bin"))

        ) {
            bestEmp = (Emps) objectInputStream.readObject();
            System.out.println(bestEmp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
