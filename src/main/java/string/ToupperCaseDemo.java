package string;

/**
 * String toLowerCase()
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全小写或全大写
 */




public class ToupperCaseDemo {

    public static void main(String[] args) {

        String str = "我爱Java";
        System.out.println(str);

        String upper = str.toUpperCase();//转换为英文全大写
        System.out.println(upper);

        String lower = str.toLowerCase();//转换为英文全小写
        System.out.println(lower);


    }
}
