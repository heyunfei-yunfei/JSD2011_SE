package day02;

import java.io.IOException;
import java.net.Socket;

/**
 * 聊天客户端
 */
public class Client {
    /*
    java.net.Socket套接字
    Socket封装了TCP协议的链接和通讯细节，使得我们可以很方便 的与
    远端计算机建立链接，并基于两个流的读写操作完成与远端计算机的数据
    交换，达到通讯目的
     */
private Socket socket;

    /**
     * 构造方法，用来初始化客户端
     */
    public Client(){
        try {
            /*
            实例化Socket时需要传入两个参数，分别是：
            host：指定服务端计算机的IP地址
            port：服务端应用程序在服务端计算机申请的端口找到运行在
            服务端计算机上IP找到服务算计算机，通过端口找到运行在
            服务端计算机上的服务端应用程序，从而与之建立连接

            注：实例化Socket的过程就是连接的过程，如果指定的地址
            无法与服务端建立链接则会抛出异常
             */
            socket = new Socket("",8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 客户端开始工作的方法
     */
    public void start(){

    }

}
