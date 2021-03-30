package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池是线程的管理机制，主要解决两个问题
 * 1：重用线程
 * 2：控制线程数量
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //1创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        //2指派任务给线程池进行执行
        for (int i=0;i<5;i++){
            Runnable runn = new Runnable() {
                public void run() {
                    try {
                        Thread t = Thread.currentThread();
                        System.out.println(t.getName()+":正在执行任务...");
                        Thread.sleep(5000);
                        System.out.println(t.getName()+":执行任务完毕");
                    }catch (InterruptedException e){
                        System.out.println("中断了！");
                    }
                }
            };
            threadPool.execute(runn);           //将任务交给线程池
            System.out.println("指派了一个任务给线程池");
        }
        //threadPool.shutdownNow();//中断所有线程，关闭线程池
        threadPool.shutdown();
        System.out.println("线程池关闭了");

    }
}
