package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有记录读取出来并输出到控制台
 */



public class ShowSllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("user.dat","r");

        for (int i=0;i<raf.length()/100;i++){
            //读取用户
            byte[] date = new byte[32];
            raf.read(date);
            String username = new String(date,"UTF-8").trim();

            raf.read(date);
            String password = new String(date,"UTF-8").trim();

            raf.read(date);
            String nickname = new String(date,"UTF-8").trim();

            int age = raf.readInt();
            System.out.println(raf.getFilePointer());
            System.out.println(username+","+password+""+nickname+""+age);


        }




    }
}
