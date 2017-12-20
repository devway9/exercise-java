package com.devway.j2se.math;

/**
 * @author devway
 * @date 2017-12-18
 */
public class TestDosEquis {
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        // X
        System.out.println(true ? x : 0);
        // 88
        System.out.println(false ? i : x);
        //返回Object类型
        System.out.println(true ? new Object() : new TestDosEquis());
    }
}
