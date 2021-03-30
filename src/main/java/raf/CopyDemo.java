package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件的复制
 */
public class CopyDemo {

    public static void main(String[] args) throws IOException {

        RandomAccessFile src = new RandomAccessFile("./bee.png","r");
        RandomAccessFile drc = new RandomAccessFile("./bee_cp.png","rw");


        int d;
        long start = System.currentTimeMillis();
        while((d=src.read())!=-1){

            drc.write(d);
        }
        System.out.println("复制完毕");
        src.close();
        drc.close();

        long end = System.currentTimeMillis();
        System.out.println("复制成功！耗时"+(end-start)+"ms");
       src.close();
        drc.close();

    }




}
