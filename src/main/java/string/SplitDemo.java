package string;

import java.util.Arrays;

/**
 * String 支持正则表达式的方法之二
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的每部分一数组形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
/**
 * 如果连续出现可拆分项，则中间会拆分出一个空字符串，如果字符串在开始就是可拆分项
 * 则首先会拆分出一个空字符串。
 * 注意，如果在字符串末尾连续匹配到可拆分项，所有拆分出的空字符串就会被忽略。
 *
 *
 *
 */
        String str1 = "abc.def.ghi.....";
        String[] arr1=str1.split("\\.");
        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1));











    }



}
