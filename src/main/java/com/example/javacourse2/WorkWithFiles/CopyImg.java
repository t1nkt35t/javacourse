package com.example.javacourse2.WorkWithFiles;

import java.io.*;

public class CopyImg {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("/Users/my3tahk/Downloads/Pictures/truesealaORIG.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("testImg.jpeg")
        ){
//            String line;
//            while((line=reader.readLine())!=null){
//                writer.write(line);
//                writer.write("\n");
//            }
            int i;
            while((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
