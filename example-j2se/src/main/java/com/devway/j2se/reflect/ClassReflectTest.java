package com.devway.j2se.reflect;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * class对象获取方式
 *
 * @author devway
 * @date 2017-12-22
 */
public class ClassReflectTest {
    @Test
    public void getClassTest() {
        Class c = "foo".getClass();
        assertEquals(c.getName(), "java.lang.String");

        Class c1 = E.A.getClass();
        assertEquals(c1.getName(), "com.devway.j2se.reflect.E");

        byte[] bytes = new byte[1024];
        Class c2 = bytes.getClass();
        assertEquals(c2.getName(), "[B");

        Set<String> s = new HashSet<String>();
        Class c3 = s.getClass();
        assertEquals(c3.getName(), "java.util.HashSet");
    }

    @Test
    public void dotClassTest() {
        boolean b;
        //!Class c = b.getClass();
        Class c = boolean.class;
        assertEquals(c.getName(), "boolean");

        Class c1 = java.io.PrintStream.class;
        assertEquals(c1.getName(), "java.io.PrintStream");

        Class c2 = int[][][].class;
        assertEquals(c2.getName(), "[[[I");

        Class c3 = String[].class;
        assertEquals(c3.getName(), "[Ljava.lang.String;");
    }

    @Test
    public void forNameTest() throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        assertEquals(c.getName(), "java.lang.String");

        Class c1 = Class.forName("[D");
        assertEquals(c1.getName(), "[D");

        Class c2 = Class.forName(double[].class.getName());
        assertEquals(c2.getName(), "[D");
    }

    @Test
    public void typeTest() {
        Class c = Boolean.TYPE;
        Class c1 = boolean.class;
        assertEquals(c, c1);

        Class c2 = Void.TYPE;
        Class c3 = void.class;
        assertEquals(c2, c3);
    }

    @Test
    public void retrunClassTest() {
        Class c = HashMap.class.getSuperclass();
        assertEquals(c.getName(), "java.util.AbstractMap");

        Class[] c1 = Character.class.getClasses();
        assertEquals(c1.length, 3);

        Class[] c2 = Character.class.getDeclaredClasses();
        assertEquals(c2.length, 4);
       /* for (Class cls : c2) {
            System.out.println(cls);
        }*/
    }

    @Test
    public void declaringClassTest() throws NoSuchFieldException, NoSuchMethodException {
        Field f = System.class.getField("out");
        Class c = f.getDeclaringClass();
        assertEquals(c.getName(), "java.lang.System");

        Method m = String.class.getMethod("intern");
        Class c1 =m.getDeclaringClass();
        assertEquals(c1.getName(),"java.lang.String");

        Class c2 = Out.inner.getClass().getDeclaringClass();
        assertEquals(c2, null);

        Class c3 = Out.inner.getClass().getEnclosingClass();
        assertEquals(c3.getName(), "com.devway.j2se.reflect.Out");
    }
}

enum E {A, B}

class Out {
    static Object inner = new Object() {
    };
}