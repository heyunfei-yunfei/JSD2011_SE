package thread;

/**
 * 有效的缩小同步（排队）的范围可以在保证并发安全的前提下尽可能的提高
 * 并发效率。
 * 同步块语法：
 * synchronize（同步监视对象）｛
 * 需要多个线程同步执行的代码片段｝
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread(){
          public void run(){
              shop.buy();
          }
        };
        Thread t2 = new Thread(){
          public void run(){
              shop.buy();
          }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    /*
    在方法使用synchronized时，同步监视器对象就是该方法所属
    对象，即：this
     */
  //public synchronized void buy(){
    public  void buy(){
        try {
            Thread t = Thread.currentThread();//获取运行buy方法的结果
            System.out.println(t.getName()+":正在挑衣服....");
            Thread.sleep(5000);
            /*
            同步块在使用时必须指定同步监视器对象（上锁的对象）。它
            可以是java中任何因引用类型的实例。只要保证多个需要同步
            运行该同步块内容的线程看到的这个对象时“同一个”即可。
            否则没有效果！
             */
            //synchronized (new Object()){ //  无效
            synchronized (this){
                System.out.println(t.getName() + ":正在试衣服....");
                Thread.sleep(5000);
            }
            System.out.println(t.getName()+":结账离开");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
