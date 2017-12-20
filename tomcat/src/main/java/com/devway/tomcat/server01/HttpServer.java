package com.devway.tomcat.server01;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HttpServer class
 * 测试url：http://localhost:8083/tomcat/src/main/webapp/index.jsp
 * @author devway
 * @date 2017-12-11
 */
public class HttpServer {
    //public  static final String WEB_ROOT=System.getProperty("user.dir")+ File.separator+"webroot";
    public  static final String WEB_ROOT=System.getProperty("user.dir")+ File.separator;

    private static final String SHUTDOW_COMMAND="/SHUTDOWN";

    private boolean shutdown = false;

    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        server.await();
    }

    public void await(){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8083);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        while(!shutdown){
            try {
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                Request request = new Request(inputStream);
                request.parse();

                Response response = new Response(outputStream);
                response.setRequest(request);
                response.sendStaticResource();

                socket.close();;
                shutdown = request.getUri().endsWith(SHUTDOW_COMMAND);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

}
