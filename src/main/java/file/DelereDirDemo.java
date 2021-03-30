package file;


import java.io.File;

/**
 * 删除目录
 */
public class DelereDirDemo {
    public static void main(String[] args) {
        //删除demo目录
        File dir = new File("demo");
        if (dir.exists()){

            /*
            delete删除时有一个前提条件：目录必须是空的才可以删除！
             */


            dir.delete();

            System.out.println("目录已删除！");
        }else{
            System.out.println("目录已存在！");
        }




    }


}
