package com.devway.j2se.load;

/**
 * Test class
 *
 * @author devway
 * @date 2017-12-14
 */
public class Test {
    void f1(B b){
        System.out.println("b");
    }
    void f1(Test1 b){
        System.out.println("Test");
    }
    public static void main(String[] args) {
        B b = new Test1();
        b.f2();
    }


}

class Test1 extends B implements A {

    @Override
    public void f1() {
    }

    @Override
    void f2() {

    }

    static void f3() {

    }


}

class B {

    void f2() {

    }

    static void f3() {

    }


}


interface A {
    void f1();
}