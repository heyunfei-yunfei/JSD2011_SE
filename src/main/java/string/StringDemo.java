package string;

/**
 * String 常量池
 * 常量池是虚拟机在堆内存中开辟的一段空间，用来缓存所有使用字符串字面量形式创建的字符串对象。
 * 当再次使用相同自变量创建字符串时会重用对象减少内存开销
 *String 常量池
 *
 */
public class StringDemo {
    public static void main(String[] args) {



        String s1="123abc";
        String s2="123abc";



        System.out.println(s1==s2);//true
        String s3 ="123abc";
        System.out.println(s2==s3);//true

        s1=s1+"!";//修改内容会创建新对象
        System.out.println("s1:"+s1);//123abc
        System.out.println("s2:"+s2);//123abc
        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//true
        //new 一定会创建新字符串对象，
        //new 一定会创建新字符串对象，java不建议这样创建字符串，因为不会重用对象
        String s4=new String("123abc");
        System.out.println("s4:"+s4);//123abc
        System.out.println(s2==s4);//false
        //字符串比较内容都要使用equals方法，几乎不会用到“==”
        System.out.println(s2.equals(s4));//true

        String s5="123"+"abc";
        System.out.println("s5:"+s5);
        System.out.println(s2==s5);//true
        /*
          这里触发了编译器的一个特性：编译器间如果能确定一个计算表达式的结果时就会进行计算
          并将结果编译到class文件中。
          下面的代码会被编译器改为：
          String s5="123abc";

         */

        String s="123";
        String s6=s+"abc";
        System.out.println("s6:"+s6);
        System.out.println(s2==s6);//false
        System.out.println(s2.equals(s6));//true
        int a=(60*60*24)*1000;





























    }







}
