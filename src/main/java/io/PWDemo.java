package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流内部有一个缓冲区，读写文本数据会被统一转换为块读写保证效率。
 * 并且可以按行读写文本数据
 *
 * java.io.PrintWriter具有自动性刷新功能的缓冲字符流，内部总是链接BufferedWriter作为缓冲功能。
 * 这个流更常用
 * 缓冲字符流内部有一个缓冲区
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /*
        PrintWriter提供了直接对文件进行操作的构造方法：
        PrintWriter（String fileName）
        PrintWriter(File file)
        并且还可以再传入一个参数来指定字符集
        实际上以上构造器内部会自行完成流链接
         */



        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
        pw.println("让我看看你的脸");
        pw.println("南方姑娘，你是否见过北方的秋凉");

        System.out.println("写出完毕");
        pw.close();



    }


}
