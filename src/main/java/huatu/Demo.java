package huatu;

import java.io.*;
import java.util.ArrayList;

public class Demo {


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("aaa");
        list.add("java");
        list.add("java");
        list.add("bbb");
        for (int i = list.size() - 1; i >= 0; i--){
            if ("java".equals(list.get(i))) {
                list.remove(i);
            }
        }
        int d=list.size();
        System.out.println(d);
    }
}

