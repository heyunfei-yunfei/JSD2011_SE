package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完文件的复制操作。
 * 思路：
 * 1：创建一个文件输入流读取源文件
 * 2;创建一个文件输出流用于复制的文件
 * 3:利用块读写的方法循环从源文件一次读取10k数据并写入到复制文件中
 * 4；复制完毕后关闭两个流
 *
 */
//

public class CopyDemo {


    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.txt");
        FileOutputStream sesc  = new FileOutputStream("qrocode_cp.txt");
        int len;

        byte[] date = new byte[1024*10];


        while((len = fis.read(date))!=-1){
            sesc.write(date,0,len);

        }
        System.out.println("复制完毕");
        fis.close();
        sesc.close();
    }



}
