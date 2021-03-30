package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 完成简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作。
 * 之后用户在控制台输入的每一行内容都要写入到文件中。
 * 当影虎单独输入“exit”时程序退出
 * 注：写入文件中的数据不需要考虑换行问题。
 */
public class Note {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入以一个文件名");


            String str =scan.nextLine();
            RandomAccessFile raf = new RandomAccessFile(str,"rw");
           // boolean yes = str.equals();

            while(true) {
                System.out.println("请输入：内容");
                String txt = scan.nextLine();
               if("exit".equals(txt)){

               break;
               }
                byte[] date = txt.getBytes("UTF-8");
                raf.write(date);
            }

            }
            }






