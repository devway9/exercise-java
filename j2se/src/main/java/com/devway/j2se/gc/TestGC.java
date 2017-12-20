package com.devway.j2se.gc;

/**
 * TestGC class
 * VM options:-XX:+UseSerialGC -XX:+PrintGCDetails -Xloggc:d:\gc.log
 * @author devway
 * @date 2017-12-13
 */
public class TestGC {
    public Object instance = null;
    public static void main(String[] args) {
        TestGC obj1 = new TestGC();
        TestGC obj2 = new TestGC();
        obj1.instance=obj2;
        obj2.instance=obj1;

        obj1 = null;
        obj2 = null;
        System.gc();;
    }
}
