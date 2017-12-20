package com.devway.j2se.object;

/**
 * @author devway
 * @date 2017-12-18
 */
public class TestStaticFactory {
    public static void main(String[] args) {
        TestStaticFactory testStaticFactory = TestStaticFactory.newInstance();
    }

    /**
     * 使用静态工厂方法替代构造器
     *
     * @return
     */
    public static TestStaticFactory newInstance() {
        return new TestStaticFactory();
    }

    private TestStaticFactory() {
    }

}
