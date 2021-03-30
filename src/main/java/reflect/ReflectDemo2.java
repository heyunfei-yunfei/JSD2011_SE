package reflect;

import java.util.Scanner;

//实例化操作
public class ReflectDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);
        try{
            //1先加载要实例化对象的类的类对象
            //Class cls = Class.forName("reflect.Person");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要实例化的类名");
            String classNAME = scanner.nextLine();
            Class cls = Class.forName(classNAME);
            //2:类对象提供了实例化对象的方法
            Object o = cls.newInstance();//注意：必须有无参构造，且是public的
            System.out.println(o);
        }catch (Exception e){
           e.printStackTrace();
        }


    }

}
