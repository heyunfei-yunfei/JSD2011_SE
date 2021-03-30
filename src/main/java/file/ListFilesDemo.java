package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录下的所有内容
        File dir = new File(".");
        /*
        boolean isFile() 判断当前File表示的是否为一个文件

        boolean isDirectory()  判断当前File表示的是否为一个目录
         */
        if (dir.isDirectory()){
            /*
               File[] listFile()
               获取该目录中的所有子项，每个子项都是以一个File实例形式保存在数组中并将该
               数组返回
             */

            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for (int i=0;i<subs.length;i++){

                System.out.println(subs[i].getName());

            }
        }





    }




}
