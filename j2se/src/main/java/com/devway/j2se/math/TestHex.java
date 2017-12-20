package com.devway.j2se.math;

/**
 * @author devway
 * @date 2017-12-18
 */
public class TestHex {
    public static void main(String[] args) {
        //! 0xcafebabe为 int，最高位为1，所以为负数
        System.out.println(Long.toHexString(0x10000000L+0xcafebabe));

        // 0xcafebabe为 long，最高位不为1，所以为整数
        System.out.println(Long.toHexString(0x10000000L+0xcafebabeL));
    }
}
