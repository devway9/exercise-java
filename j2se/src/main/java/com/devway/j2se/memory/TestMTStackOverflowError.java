package com.devway.j2se.memory;

/**
 * TestMTStackOverflowError class
 * VM options:-Xss1024M
 * @author devway
 * @date 2017-12-13
 */
public class TestMTStackOverflowError extends Thread{
    private static int threadNum = 0;

    public static void main(String[] args) throws Throwable {
        try {
            while (true) {
                threadNum++;
                new TestMTStackOverflowError().start();
            }
        } catch (Throwable e) {
            System.out.println("thread num:" + threadNum);
            throw e;
        }
    }

    @Override
    public void run() {
        while(true){

        }
    }
}
