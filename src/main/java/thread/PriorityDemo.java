package thread;

/**
 * 线程的优先级
 * 线程的优先级分为10个等级，分别用整数1-10表示。
 * 其中1为最低优先级，5为默认优先级，10为最高优先级。
 *
 * 当线程调用start方法后就纳入到线程调度器中统一管理，此时线程只能被动的被分配
 * 时间片进行并发运行，但是优先级越高的线程获取cpu时间片的次数就越多
 * （处于同一个cpu核心中的线程）。
 * 因此通过调整线程的优先级可以最大程度的改善线程获取cpu时间片的次数
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("min");
                }

            }


        };
        Thread max = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("max");
                }

            }
        };

        Thread norm = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("norm");
                }

            }
        };

        //min.setPriority(1);
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        norm.start();
        max.start();
    }
}