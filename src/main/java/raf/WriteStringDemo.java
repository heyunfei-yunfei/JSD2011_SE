package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * 项文件中写入文本数据（字符串）
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.ext","rw");

        String str = "上帝关闭一扇门，必会打开一扇窗";
        /*
        String 提供了将当前字符串转换为一组字节的方法：
        byte[] getBytes(String csn)
        参数为指定的字符集的名字，常用的：utf-8
        当字符集名字指定错误时，会抛出如下异常：不支持的字符集异常
        UnsupportedEncodingException:utf-8
         */
       // byte[] date = str.getBytes("UFT-8");
        byte[] date = str.getBytes("UTF-8");

        raf.write(date);
        System.out.println("写出完毕");
        raf.close();
    }
}
