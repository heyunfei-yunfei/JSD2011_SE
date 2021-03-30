package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常处理机制在IO中的使用
 * 异常处理机制在IO中的使用
 */
public class FinallyDemo2 {

    public static void main(String[] args) {

        FileOutputStream fos = null;

        try {

           // FileOutputStream fos = new FileOutputStream("fos.dat");
            fos = new FileOutputStream("fos.dat");
            fos.write(1);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
               if (fos!=null){
                   fos.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
