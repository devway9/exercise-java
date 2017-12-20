package com.devway.j2se.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TestMemoryUse class
 * 通过设置-Xmx和-Xms设置
 * @author devway
 * @date 2017-12-12
 */
public class TestMemoryUse {
    public static void main(String[] args) {
        getMemory();
        List list = new ArrayList();
        int i = 0;
        try {
            while (true) {
                i++;
                Integer integer = new Integer(i);
                list.add(integer);
            }
        } finally {
            System.out.println(i);
        }
    }

    public static void getMemory() {
        long maxMem = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        long freeMem = Runtime.getRuntime().freeMemory() / 1024 / 1024;
        long usedMem = maxMem - freeMem;
        System.out.println("最大内存：" + maxMem + "m");
        System.out.println("空闲内存：" + freeMem + "m");
        System.out.println("已使用内存：" + usedMem + "m");
    }
}
