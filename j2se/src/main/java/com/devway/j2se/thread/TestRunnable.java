package com.devway.j2se.thread;

/**
 * TestRunnable class
 *
 * @author devway
 * @date 2017-12-11
 */
public class TestRunnable implements Runnable {
    public static void main(String[] args) {
        new Thread(new TestRunnable()).start();
        new Thread(new TestRunnable()).start();
    }

    @Override
    public void run() {
        Thread currentThread=Thread.currentThread();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(currentThread.getId() + " " + currentThread.getName() + ":" + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
