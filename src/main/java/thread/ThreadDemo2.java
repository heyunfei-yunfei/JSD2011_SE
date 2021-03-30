package thread;

/**
 * 第二种创建线程的方式：
 * 实现Runnable接口单独定义线程任务
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //先创建线程任务
       Runnable r1 = new MyRunnable1();
       Runnable r2 = new MyRunnable2();
       //创建线程并将任务交给线程
       Thread t1 = new Thread(r1);
       Thread t2 = new Thread(r2);
       t1.start();
       t2.start();
//什么是进程，进程是操作系统中运行的一个任务 （一个进程的）


    }
}
class MyRunnable1 implements Runnable {
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("你谁啊");
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("开门，查水表");
        }
    }
}