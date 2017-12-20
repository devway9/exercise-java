package com.devway.j2se.memory;

/**
 * TestString class
 *
 * @author devway
 * @date 2017-12-13
 */
public class TestString {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        String st3="1234";
        System.out.println(st3=="1234");

        String st4= new String("1234");
        String st5 = new StringBuilder("12").append("34").toString();
        System.out.println(st3==st4);
        System.out.println(st4==st5);
        System.out.println(st4.intern()==st3);
        System.out.println(st5.intern()==st3);

    }
}
