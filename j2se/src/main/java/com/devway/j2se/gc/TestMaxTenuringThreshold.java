package com.devway.j2se.gc;

/**
 * TestAllocation class
 * VM options:-verbose:gc -Xms200M -Xmx200M -Xmn100M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=autowiring
 *
 * @author devway
 * @date 2017-12-13
 */
public class TestMaxTenuringThreshold {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB/4];
        System.out.println(">>>autowiring");
        allocation2 = new byte[4 * _1MB];
        System.out.println(">>>2");
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        System.out.println(">>>3");
       allocation3 = new byte[4 * _1MB];
        System.out.println(">>>4");

    }
}
