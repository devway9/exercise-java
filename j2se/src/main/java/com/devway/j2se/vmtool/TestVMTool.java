package com.devway.j2se.vmtool;

import com.devway.j2se.thread.TestRunnable;

/**
 * TestVMTool class
 *
 * @author devway
 * @date 2017-12-13
 */
public class TestVMTool implements Runnable {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(30 * 1000);
            new Thread(new TestVMTool()).start();
        }

    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
               byte[] b= new byte[50*_1MB];
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
