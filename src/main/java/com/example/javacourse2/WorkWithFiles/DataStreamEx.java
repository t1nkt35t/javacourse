package com.example.javacourse2.WorkWithFiles;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myTest.bin"));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream("myTest.bin"))
        ) {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeShort(120);
            dataOutputStream.writeInt(500);
            dataOutputStream.writeLong(1_000_000L);
            dataOutputStream.writeFloat(3.14F);
            dataOutputStream.writeDouble(123.456);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
