package com.devway.j2se.math;

/**
 * @author devway
 * @date 2017-12-18
 */
public class TestComOperator {
    public static void main(String[] args) {
        short s = 1;
        int i = 2;
        // 自动将计算结果转为short类型
        s += i;
        // 需要强制转换
        s = (short) (s + i);
    }
}
