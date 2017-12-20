package com.devway.j2se.annotation;

/**
 * @author devway
 * @date 2017-12-19
 */
public class AnnotationTest {
    public static void main(String[] args) {
        new AnnotationTest().f1("");
    }

    @AnnotationDef(id = 33, desc = "test")
    public void f1(String desc) {
        System.out.println(desc);
    }

}
