package com.devway.j2se.memory;

/**
 * TestStackOverflowError class
 * VM options:: -Xss128K
 * @author devway
 * @date 2017-12-12
 */
public class TestStackOverflowError {
    public static int stackLength = 0;

    public static void main(String[] args) throws Throwable {
        try{
            f1();
        }catch (Throwable e){
            System.out.println("stack length:"+stackLength);
            throw  e;
        }
    }

    public static void f1() {
        stackLength++;
        f1();

    }
}
