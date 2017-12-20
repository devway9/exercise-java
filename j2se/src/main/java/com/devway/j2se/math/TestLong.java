package com.devway.j2se.math;

/**
 * @author devway
 * @date 2017-12-18
 */
public class TestLong {
    public static void main(String[] args) {
        //计算的是一个int类型，最后再转为long，导致溢出
        long microsPerDay = 24 * 60 * 60 * 1000 * 1000;
        long millisPerDay = 24 * 60 * 60 * 1000;
        //! 5
        System.out.println(microsPerDay / millisPerDay);

        microsPerDay = 24L * 60 * 60 * 1000 * 1000;
        millisPerDay = 24 * 60 * 60 * 1000;
        // 1000
        System.out.println(microsPerDay / millisPerDay);
    }
}
