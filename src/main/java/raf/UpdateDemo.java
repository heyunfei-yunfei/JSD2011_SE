package raf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * 修改昵称功能
 * 程序启动后，要求用户输入用户名和昵称。然后将user,date文件中该用户的
 * 昵称进行修改。如果输入的用户名不存在则输出“查无此人”。
 *
 * 思路：
 * 首先循环读取user.date文件每个用户的用户名并进行比对，如果找到该用户则将指针移动到该记录的昵称位置，然后将新的昵称转换为字节数组后
 * 扩容到32字节并写入来覆盖原昵称信息
 *
 *节点流 可以从或向一个
 *
 */

public class UpdateDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
















    }




}
