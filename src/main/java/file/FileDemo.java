package file;

import java.io.File;

/**
 * java.io.File
 * File用于表示硬盘上的一个文件或目录（实际上表示的城市一个抽象路径）
 * 使用File可以：
 * 1：访问表示的文件或目录的属性（名字，大小，权限等）
 * 2.创建，删除文件或目录
 * 3.范文一个目录中的子项
 *
 * 但是File不能访问文件数据
 *
 */

public class FileDemo {


    public static void main(String[] args) {
        //File file = new file ("D/idea_workspace/JSD2011_SE/demo.txt");
        /*
        写程序时需要制定路径时通常使用相对路径，虽然看起来模糊，但是他有更好的跨平台性。
        “./”在相对目录中的意思是“当前目录”，这个目录具体指那里要视当前程序的运行环境
        而定。对于IDEA和ecilipse而言，当前目录指定的是当前程序所在的项目目录。
         */
        File file = new File("./demo.txt");
         String name=file.getName();
        System.out.println(name);
        long length = file.length();
        System.out.println("大小："+length+"字节");

        boolean cr = file.canRead();
        System.out.println("可读"+cr);
        boolean cw = file.canWrite();
        System.out.println("可写"+cw);
        boolean ih = file.isHidden();
        System.out.println("是否隐藏"+ih);

    }



}
