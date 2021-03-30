package string;

/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定的内容开始或结束的
 */


public class StartWithDemon {
    public static void main(String[] args) {
        String str = "www.tedu.cn";

        boolean start = str.startsWith("www.");
        System.out.println("startsWith:"+start);

        boolean ends = str.endsWith(".cn");
        System.out.println("endsWith:"+ends);






    }




}
