package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
从文件中读取文本内容
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("note.txt","rw");

        byte[] date = new byte[(int)raf.length()];
        raf.read(date);
        String str = new String(date,"UTF-8");
        System.out.println(str);
        raf.close();


    }
}
