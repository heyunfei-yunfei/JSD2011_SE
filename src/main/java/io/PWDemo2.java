package io;

import java.io.*;

/**
 * 使用流链接创建PrintWriter
 *
 *
 *
 *
 */


public class PWDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);//块写







        pw.println();
        pw.println();
        System.out.println("写出完毕");
        pw.close();







    }






}
