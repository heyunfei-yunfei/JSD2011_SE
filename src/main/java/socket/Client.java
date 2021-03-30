package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室的客户端
 *
 */



public class Client {
    /**
     * 构造方法，用来初始化客户端
     */

    /*
    java,net.Socket 套接字
    Socket封装了TCP协议的链接和通讯细节。使得我们可以很方便的与远端计算机建立连接，并基于两个读写操作完成与远端计算机
     */

      private Socket socket;
      public Client() {
          try {

          /*
          实例化Socket时需要传入两个参数，分别是：
          host;指定服务端计算机的IP地址
          port：服务端应用程序在服务端计算机上申请的端口
          我们可以通过IP找到服务端计算机，通过端口找到运行在
          服务端计算机上的服务端应用程序，从而与之建立链接。


          注;实例化Socket的过程就是连接的过程，如果指定的地址
          无法与服务端建立连接则会抛出异常
          */
              System.out.println("正在连接服务器。。。。");
              socket = new Socket("176.111.1.182", 8005);
              System.out.println("与服务端建立链接！");
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
    /**
     * 客户端开始工作的方法
     *
     */
    public  void start(){
        //先启动用于读取服务端发送过来消息的线程
        ServerHandler handler = new ServerHandler();
        Thread t = new Thread(handler);
        t.start();
        try {
            /**
             * OutputStream getOutputStream()
             * 通过Socket的这个方法获取的字节输出流写出的字节会通过网络
             * 发送给远端计算机
             */
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);


            Scanner scanner = new Scanner(System.in);
            System.out.println("开始聊天吧");

            while(true){
                String line = scanner.nextLine();
                if ("exist".equals(line)){

                    break;
                }
             pw.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args){
          Client client = new Client();
          client.start();

      }

    /**
     * 该线程负责循环读取服务端发送过来的消息
     */
    private class ServerHandler implements Runnable{
        public void run(){
            try {

                //通过socket获取输入流，获取服务端发送回来的消息
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(),"UTF-8"
                        )
                );
                //循环读取服务端发送过来的消息
                String line;
                while ((line = br.readLine())!=null){
                    System.out.println(line);
                }

            }catch (Exception e){

            }

        }
      }

}
