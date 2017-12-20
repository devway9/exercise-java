package com.devway.j2se.load;


/**
 * TestClinitSyn class
 *
 * @author devway
 * @date 2017-12-14
 */
public class TestClinitSyn {

    public static void main(String[] args) {
        Runnable runable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId()+" init");
                ClinitSyn syn =new ClinitSyn();
                System.out.println(Thread.currentThread().getId()+" end");
            }
        };
        new Thread(runable).start();
        new Thread(runable).start();
    }
}

class ClinitSyn {
    static {
        if (true) {
            while (true) {

            }
        }
    }
}