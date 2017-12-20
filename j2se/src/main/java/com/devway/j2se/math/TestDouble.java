package com.devway.j2se.math;

import java.math.BigDecimal;

/**
 * TestDouble class
 *
 * @author devway
 * @date 2017-12-18
 */
public class TestDouble {
    public static void main(String[] args) {
        //! 0.8999999999999999
        System.out.println(2.0 - 1.0);
        //! 0.8999999999999999
        System.out.println(new BigDecimal(2.0).subtract(new BigDecimal(1.0)));
        // 0.9
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.0")));

    }
}
