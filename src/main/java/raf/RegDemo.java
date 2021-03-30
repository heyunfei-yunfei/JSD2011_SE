package raf;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 程序启动后，要求用户输入：用户名，密码，昵称和年龄
 * 然后将该用户信息写入文件user.dat中
 *
 * 设计：
 * 每条记录占用100字节，其中应户名，密码，昵称各自占用32字节。年龄是int值固定
 * 占4字节
 * 字符串故意留白可以方便后期修改，并且可以让长度固定，统一，便于读取。
 *
 */
public class RegDemo {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("欢迎注册");
        System.out.println("请输入用户名");
        String username = scan.nextLine();
        System.out.println("请输入密码");
        String password = scan.nextLine();
        System.out.println("请输入昵称");
        String nickname =scan.nextLine();
        System.out.println("请输入年龄");
        int age = scan.nextInt();
        System.out.println(username+","+password+","+nickname+","+age);

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        //先将指针移动到文件末尾，以便追加记录
        //raf.seek(raf.length());
        //写用户名
        byte[] date = username.getBytes("UTF-8");
        date = Arrays.copyOf(date,32);
        raf.write(date);

         date = password.getBytes("UTF-8");
        date = Arrays.copyOf(date,32);
        raf.write(date);

        date = nickname.getBytes("UTF-8");
        date = Arrays.copyOf(date,32);
        raf.write(date);
        //写入年龄
        raf.writeInt(age);
        System.out.println("注册完成");
        raf.close();
    }
}
