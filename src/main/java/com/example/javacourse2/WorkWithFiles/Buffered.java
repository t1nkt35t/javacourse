package com.example.javacourse2.WorkWithFiles;

import java.io.*;

public class Buffered {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("testtest.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"));
        ){
            String line;
            while((line=reader.readLine())!=null){
                writer.write(line);
                writer.write("\n");
            }
//            int character;
//            while((character=reader.read())!=-1){
//                writer.write(character);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
