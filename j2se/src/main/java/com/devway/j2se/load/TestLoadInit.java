package com.devway.j2se.load;

/**
 * TestLoadTime class
 *
 * @author devway
 * @date 2017-12-14
 */
public class TestLoadInit {
    public static void main(String[] args) throws ClassNotFoundException {
        //主动引用1.autowiring new
        //LoadInit LoadInit = new LoadInit();

        //主动引用1.2 getstatic
        //System.out.println(LoadInit.static_value);

        //主动引用1.3 putstatic
        //LoadInit.static_value=autowiring;

        //主动引用1.4 invokestatic
        //LoadInit.f1();

        //主动引用2 reflect
        //Class.forName("com.devway.j2se.load.LoadInit");

        //主动引用3 parent
        //SubLoadInit child = new SubLoadInit();

        //被动引用1 仅父类被初始化
        //System.out.println(SubLoadInit.static_value);

        //被动引用2 不会触发此类的加载
        //LoadInit[] array = new LoadInit[10];

        //被动引用3 调用static final常量不会加载类，它是编译期就放入了常量池的静态字段
        //System.out.println(LoadInit.STATIC_FINAL_VALUE);
    }
}

class LoadInit {
    static {
        System.out.println("LoadInit is init");
    }

    static final int STATIC_FINAL_VALUE = 1111;
    static int static_value=2222;
    final int final_value = 3333;
    int value;

    static void f1() {

    }
}

class SubLoadInit extends LoadInit {
    static int c=4444;
    static {
        System.out.println("SubLoadInit is init");
    }
}
