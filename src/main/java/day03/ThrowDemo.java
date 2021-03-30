package day03;

/**
 * 测试异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
          Person p = new Person();
          //满足于法，但是不满足业务的情况！
        try {
            p.setAge(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄："+p.getAge());
        System.out.println("程序结束了...");
    }
}
