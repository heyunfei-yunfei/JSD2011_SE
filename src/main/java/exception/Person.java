package exception;

/**
 * 使用当前类测试异常的抛出
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>100){
           // throw new RuntimeException("此人年龄不合法");
            throw new IllegalAgeException("年龄不合法："+age);
           /*
           通常我们使用throw对外抛出一个异常时就应当在当前方噶上使用throws声明这个异常的抛出来通知调用者处理。
           只有抛出RuntimeException时可以不这样做
            */
        }


        this.age = age;
    }
}