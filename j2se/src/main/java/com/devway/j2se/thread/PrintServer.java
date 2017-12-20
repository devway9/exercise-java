package com.devway.j2se.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * PrintServer class
 *
 * @author devway
 * @date 2017-12-11
 */
public class PrintServer {
    private List list = new ArrayList();

    public PrintServer() {
        Runnable service=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    realPrint(Thread.currentThread().getName()+":"+String.valueOf(i));
                }
            }
        };
        new Thread(service).start();
    }

    public void print(String job) {
        list.add(job);
    }



    private void realPrint(String job) {
        System.out.println("realPrint:" + job);
    }

    public static void main(String[] args) {
        new PrintServer();
        new PrintServer();
        new PrintServer();
        new PrintServer();
    }
}
