package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源，由于切换时机不确定，导致操作顺序
 * 出现了混乱而产生错误。严重时可能导致系统瘫痪
 *
 * 临界资源：操作该资源的整个过程同时只能被单个线程进行的资源。
 * 相当于多个人争抢同一个东西导致的混乱
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
          public void run(){
              while (true){
                  int bean = table.getBean();
                  Thread.yield();
                  System.out.println(getName()+":"+bean);
              }
          }
        };
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();

    }
}

class Table{
    private int beans = 20;//桌子上有20个豆子

    /**
     * 当一个方法使用synchronized修饰后，这个方法称为同步方法，即：
     * 多个线程不能同时在方法内部执行，只能一个一个进行
     * 将并发操作改为同步操作可以解决并发安全问题。
     * 当一个方法使用修饰后，这个方法称为同步方法
     * @return
     */
    public synchronized int getBean(){
        if(beans==0){
            throw new RuntimeException("没有豆子了");
        }
        //判断后，但beans还没有--操作前切换线程，会出现并发安全问题
        Thread.yield();//该方法让线程主动让出cpu时间,模拟到这里没有时间了
         return beans--;
    }
}
