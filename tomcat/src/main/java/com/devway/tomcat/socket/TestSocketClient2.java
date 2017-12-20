package com.devway.tomcat.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * TestSocketClient2 class
 *
 * @author devway
 * @date 2017-12-11
 */
public class TestSocketClient2 {

    // 搭建客户端
    public static void main(String[] args) throws IOException {
        try {
            // autowiring、创建客户端Socket，指定服务器地址和端口
            Socket socket = new Socket("127.0.0.autowiring", 8082);
            System.out.println("客户端启动成功");

            //2、从客户端输入信息，并发送给服务端
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter write = new PrintWriter(socket.getOutputStream());

            //3、从服务端读取信息
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readLine = br.readLine();
            while (!"end".equals(readLine)) {
                //发送给服务端
                write.println(readLine);
                write.flush();
                System.out.println("Client:" + readLine);
                //读取服务端信息
                System.out.println("Server:" + in.readLine());
                //从客户端输入
                readLine = br.readLine();
            }

            //4、关闭资源
            in.close();
            write.close(); // 关闭Socket输出流
            br.close();
            socket.close(); // 关闭Socket
        } catch (Exception e) {
            // 出错，打印出错信息
            System.out.println("can not listen to:" + e);
        }
    }
}
