package string;

/**
 * char charAt(int index)
 * 返回给定位置的字符
 */
public class CharAtDemo {
    public static void main(String[] args) {
        //           0123456789
        String str = "helloworld";
        char c = str.charAt(5);
        System.out.println(c);

        String line = "上海自来水来自海上";
        //  0 1 2 3
        for (int i = 0; i < line.length() / 2; i++) {
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length() - 1 - i);
            if (c1 != c2) {
                System.out.println("不");
                break;
            }
        }
        System.out.println("是回文");
    }
}