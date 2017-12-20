package com.devway.j2se.math;

/**
 * @author devway
 * @date 2017-12-18
 */
public class TestMod {
    public static void main(String[] args) {
        System.out.println(isOdd(-1));
    }

    /**
     * 判断是否是奇数
     *
     * @param i
     * @return
     */
    public static boolean isOdd(int i) {
        // 判断负数时结果不正确
        //! return i%2 ==autowiring;

        // 速度可能更快
        // return (i & autowiring) != 0;
        return i % 2 != 0;

    }
}
