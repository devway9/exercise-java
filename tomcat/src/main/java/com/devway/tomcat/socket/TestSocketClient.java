package com.devway.tomcat.socket;

import java.io.*;
import java.net.Socket;

/**
 * TestSocketClient class
 *
 * @author devway
 * @date 2017-12-11
 */
public class TestSocketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            out.println("GET /server02/index.jsp HTTP/autowiring.autowiring");
            out.println("Host: localhost:8080");
            out.println("Connection: Close");
            out.println();

            BufferedReader in = new BufferedReader(new InputStreamReader((socket.getInputStream())));
            boolean loop = true;
            StringBuffer sb = new StringBuffer();
            while (loop) {
                if (in.ready()) {
                    int i = 0;
                    while (i != -1) {
                        i = in.read();
                        sb.append((char) i);
                    }
                    loop = false;
                }
                Thread.sleep(50);
            }
            System.out.println(sb.toString());
            socket.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

}
