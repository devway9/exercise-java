package com.devway.j2se.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author devway
 * @date 2017-12-21
 */
public class Test1 {
    public static void main(String[] args) {
        test(Obj.class);
        System.out.println(1);
    }
    public static void test(Class c){
        Field[] fields=c.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.isAnnotationPresent(Table.class));
            System.out.println(field.getAnnotation(Table.class));
            if(field.isAnnotationPresent(Table.class)){
                Table t=(Table)field.getAnnotation(Table.class);
                String s=t.tableName();
                System.out.println(s);
            }
        }
    }
}
