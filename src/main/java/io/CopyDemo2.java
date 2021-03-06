package io;

import java.io.*;

/**
 * 高级流
 * 如果我们把低级流想向成为水管，那么高级流就是连接在水管水管上对水做加工的各种设备，比如“热水器”，“净水器”
 * 使得我们在读写数据的过程经过他们时就已经做好了相应的处理工作，简化我们对数据的相关操作
 *
 * 实际开发中我们经常会串联一组高级流并最终连接在某个低级流上，可以很轻松
 * 的实现复杂数据的读写。
 *
 *
 * 缓冲流：java.io.BufferedInputStream和BufferedOutputStream
 * 缓冲字节输入流与输出流是常用的一对高级流，在流链接中的作用是加快读写数据的效率
 *
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("jye.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("jye_code.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
          int d;
          long start = System.currentTimeMillis();

          /*
          缓冲流内部有一个字节数组，无论我们进行何种读写方式，最终都会被缓冲流转换为块读写的方式来保证读写效率，其内部的字节
          数组默认为8k
           */
          //
          while ((d = bis.read())!=-1) {
              bos.write(d);
          }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时："+(end-start)+"ms");
        bis.close();
        bos.close();
//


    }
}
