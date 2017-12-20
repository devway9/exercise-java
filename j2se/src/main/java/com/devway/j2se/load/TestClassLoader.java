package com.devway.j2se.load;

import java.io.IOException;
import java.io.InputStream;

/**
 * TestClassLoader class
 *
 * @author devway
 * @date 2017-12-14
 */
public class TestClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                InputStream is = getClass().getResourceAsStream(fileName);
                if (is == null) {
                    return super.loadClass(name);
                }
                try {
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };
        Class cls = myLoader.loadClass("com.devway.j2se.load.TestClassLoader");
        Object obj = cls.newInstance();
        System.out.println(obj.getClass());
        System.out.println(cls.getClassLoader());
        System.out.println(obj instanceof com.devway.j2se.load.TestClassLoader);
    }

}
