package day11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 改错题
 * @author Xiloer
 *
 */
public class Test02 {


    /*
    只要一个类在idea中鼠标右键菜单中不能run，说明当前类没有main方法
     */
	public static void main (String [] args) {
	    //语法错误！
		Collection<String> c = new ArrayList();//对ArrayList导包
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		for(String s : c) {
			System.out.println(s);
		}
	}
}



