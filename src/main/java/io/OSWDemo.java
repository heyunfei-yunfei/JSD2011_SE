package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * 字符流的超类是:java.io.Reader和Writer
 * 字符流的最小读写单位为一个字符（char）。但是实际底层还是读写字节
 * 只是字符与字节的转换工作由字符流完成。所以，字符流只是适合读写文本数据！
 *
 * 转换流：java.io.InoutStreamReader和OutputStreamWriter
 * 转换流是一对高级流，我们实际应用中几乎不会直接操作转换流，但是在流链接的建立中他们是非常重要的一环！
 * 起到的作用是衔接其他高级字符流与字节流的桥梁。
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");

        /*
        创建时通常在构造方法中再传入第二个参数：指定字符集的名字这样通过转换流写出的字符都会按照字符集转换为字节后写出
        如果不指定第二个参数，则默认使用系统字符集，不推荐这样做!
        这不利于跨平台（不同的系统默认的字符集可能不相同）
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        osw.write("我可以接受你的");
        osw.write("很多好东西");
        System.out.println("写出完毕");
        osw.close();
    }



}
