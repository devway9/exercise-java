package com.devway.j2se.memory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * TestDirectMomoryOOM class
 * VM options:-XX:MaxDirectMemorySize=10M
 * @author devway
 * @date 2017-12-13
 */
public class TestDirectMomoryOOM {
    private static final int _1MB =1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }
}
