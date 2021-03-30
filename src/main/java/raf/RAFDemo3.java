package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据，以及RAF基于指针的读写操作
 */


public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");

        //创建RAF后指针默认在文件的最开始处。位置的表示与数组下标一样从0开始
        long pos = raf.getFilePointer();
        System.out.println("pos"+pos);
        //向文件中写入int最大值
        /*
        int最大值
        011111111 11111111 11111111 11111111
        011111111 11111111 11111111 11111111
        max>>>24
        00000000 00000000 000000000 11111111
         */

        int max = Integer.MAX_VALUE;
        raf.write(max>>>24);
        System.out.println("pos"+raf.getFilePointer());
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max);
        System.out.println("pos"+raf.getFilePointer());
        /*
        RAF提供了方便写出基本类型的相关方法
         */
        raf.writeInt(max);//这一句等同上面4的四句写出操作
        System.out.println("pos"+raf.getFilePointer());
        raf.writeLong(123456789);
        System.out.println("pos"+raf.getFilePointer());
        raf.writeDouble(123.123);
        System.out.println("pos"+raf.getFilePointer());
        System.out.println("输出完毕");
        raf.close();

        raf.seek(0);//移动指针到指定位置（下标）
        /*
        RAF同样提供了方便读取基本类型的方法
        int readInt()
        连续读取4个字节，并将其转换为对应的int值后返回
         */

        int d = raf.readInt();
        System.out.println(d);

        raf.seek(8);
        long l = raf.readLong();
        System.out.println(l);

        double dou = raf.readDouble();
        System.out.println(dou);
        /*
        readInt,readLong这些方法在读取相应的字节数的过程中如果
        读取到了文件末尾则会直接抛出EOFException。并不是再用-1
        表示读取到了文件末尾
         */
        //d = raf.readInt();
        //System.out.println(d);

        raf.close();



    }

}
