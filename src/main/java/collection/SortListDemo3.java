package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 当我们已经实现了Comparable接口，但是该比较规则不满足
 * 我们排序需求时，也可以用重载的sort方法排序
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("阿里巴巴");
//
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//               int name1 = o1.length();
//               int name2 = o2.length();
//                return name1-name2;
//            }
//        });
       // Collections.sort(list,(o1, o2) -> o1.length()-o2.length());//字符由少到多排序
        Collections.sort(list,(o1, o2) -> o2.length()-o1.length());//字符由多到少排序
        System.out.println(list);

    }
}
