package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合元素翻转:第一个在最后一个，最后一个在第一个。
 * 以此类推，并输出
 * 
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        //反转集合元素
        Collections.reverse(list);
        System.out.println(list);
        //打乱集合元素
        Collections.shuffle(list);
        System.out.println(list);
    }

}
