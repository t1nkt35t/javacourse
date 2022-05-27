package com.example.javacourse2.WorkWithFiles.programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialEx {
    public static void main(String[] args) {
        List<String> emps;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("emps1.bin"))

        ) {
            emps = (ArrayList) objectInputStream.readObject();
            System.out.println(emps);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
