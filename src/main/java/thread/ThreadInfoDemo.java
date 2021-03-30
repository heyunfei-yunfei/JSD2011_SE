package thread;

/**
 * 获取线程相关信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        //获取主线程
        Thread main = Thread.currentThread();
        String name = main.getName();
        System.out.println("name:"+name);
        long id = main.getId();
        System.out.println("id:"+id);
        //获取线程的优先级
        int priority = main.getPriority();
        System.out.println("优先级"+priority);
        //线程是否活着
        boolean isAlive=main.isAlive();
        //线程是否为守护线程
        boolean isDaemon= main.isDaemon();
        //线程是否中断
        boolean isInterrupted=main.isInterrupted();
        System.out.println("isAlive；"+isAlive);
        System.out.println("isDaemon"+isDaemon);
    }

}
