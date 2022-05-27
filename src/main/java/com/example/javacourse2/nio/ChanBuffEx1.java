package com.example.javacourse2.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChanBuffEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("Test10.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder poem = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println(byteRead);

                buffer.flip();


                while(buffer.hasRemaining()){
                    poem.append((char)buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(poem);

            String text = "\nTHE\nEND";
            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes());
//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes(StandardCharsets.UTF_8).length);
//            buffer1.put(text.getBytes());
//            buffer1.flip();
//            channel.write(buffer1);
            channel.write(buffer1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }
}
