package com.devway.j2se.gc;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * TestAllocation class
 * VM options:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author devway
 * @date 2017-12-13
 */
public class TestAllocation {
    private static final int _1MB =1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
       byte[] allocation1,allocation2,allocation3,allocation4;
       allocation1 = new byte[2* _1MB];
        System.out.println(">>>autowiring");
       allocation2 = new byte[2* _1MB];
        System.out.println(">>>2");
       allocation3 = new byte[2* _1MB];
        System.out.println(">>>3");
       allocation4 = new byte[4 * _1MB];
        System.out.println(">>>4");
    }
}
