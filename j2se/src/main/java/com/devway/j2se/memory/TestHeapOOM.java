package com.devway.j2se.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * TestHeapOOM class
 * VM options: -Xms20M -Xmx30M
 *
 * @author devway
 * @date 2017-12-13
 */
public class TestHeapOOM {
    public static int objectNum = 0;

    public static void main(String[] args) throws Throwable {
        try {
            List<Object> list = new ArrayList<Object>();
            while (true) {
                objectNum++;
                list.add(new Object());
            }
        } catch (Throwable e) {
            System.out.println("object num:" + objectNum);
            throw e;
        }
    }
}
