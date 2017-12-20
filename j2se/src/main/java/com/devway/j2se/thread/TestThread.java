package com.devway.j2se.thread;

/**
 * TestThread class
 *
 * @author devway
 * @date 2017-12-11
 */
public class TestThread extends Thread {
    private String word;
    private int delay;

    public TestThread(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    public static void main(String[] args) {
        Thread thread1 = new TestThread("t1", 100);
        Thread thread2 = new TestThread("t2", 100);
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        Thread currentThread=Thread.currentThread();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(currentThread.getId() + " " + currentThread.getName() + ":" + i);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
