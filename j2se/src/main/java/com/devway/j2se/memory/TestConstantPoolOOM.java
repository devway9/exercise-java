package com.devway.j2se.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * TestConstantPoolOOM class
 * 分别在jdk6和jdk7上运行
 * @author devway
 * @date 2017-12-13
 */
public class TestConstantPoolOOM {
    public static int objectNum = 0;

    public static void main(String[] args) throws Throwable {
        try {
            List<String> list = new ArrayList<String>();
            while (true) {
                objectNum++;
                list.add(String.valueOf(objectNum).intern());
            }
        } catch (Throwable e) {
            System.out.println("object num:" + objectNum);
            throw e;
        }
    }
}
