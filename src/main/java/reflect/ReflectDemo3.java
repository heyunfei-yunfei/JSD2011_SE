package reflect;

import java.lang.reflect.Constructor;

/**
 * 使用有参构造器进行实例化
 */
public class ReflectDemo3 {
    public static void main(String[] args) {
        Person p = new Person("苍老师",55);
        System.out.println(p);

        try {
            Class cls = Class.forName("reflect.Person");
           // Constructor c = cls.getConstructor()不传参获取无参构造器
            Constructor c = cls.getConstructor(String.class,int.class);
            //new Person("克井老师，18)；
            Object  o = c.newInstance("克晶老师",18);
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
