package reflect;

import java.lang.reflect.Method;

//调用私有成员
public class ReflectDemo6 {
    public static void main(String[] args) {
        //Person p = new Person();
        //p.hello();;//编译不通过！
        try{
            Class cls = Class.forName("reflect.Person");
            Object o = cls.newInstance();
            //获取方法hello
            // Method m = cls.getDeclaredMethod("hello);//读取不到私有方法
            //获取本类定义的方法，包含私有方法
            Method m = cls.getDeclaredMethod("hello");
            m.setAccessible(true);
            m.invoke(o);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
