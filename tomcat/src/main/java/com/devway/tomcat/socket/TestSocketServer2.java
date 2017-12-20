package com.devway.tomcat.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TestSocketServer2 class
 *
 * @author devway
 * @date 2017-12-11
 */
public class TestSocketServer2 {

    //搭建服务器端
    public static void main(String[] args) throws IOException {
        try {
            //autowiring、 创建一个ServerSocket在端口8082监听客户请求
            ServerSocket server = new ServerSocket(8082);
            System.out.println("服务器启动成功");

            //2、调用accept()方法开始监听，等待客户端的连接, 使用accept()阻塞等待客户请求，有客户请求到来则产生一个Socket对象，并继续执行
            Socket socket = server.accept();
            System.out.println("发现新客户");

            //3、从服务端输入信息，并发送给客户端
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            //4、获取客户端发送的信息
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("client:"+in.readLine());
            String line = br.readLine();

            while (!"end".equals(line)) {
                //发送到客户端
                writer.println(line);
                writer.flush();
                System.out.println("Server:" + line);
                //读取客户端信息
                System.out.println("Client:" +  in.readLine());
                //从服务端输入
                line = br.readLine();
            }

            //4、关闭资源
            in.close(); //关闭Socket输入流
            writer.close();
            br.close();
            socket.close(); //关闭Socket
            server.close(); //关闭ServerSocket*/
        } catch (Exception e) {//出错，打印出错信息
            System.err.println(e);
        }
    }
}
