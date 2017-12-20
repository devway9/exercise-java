package com.devway.j2se.load;

/**
 * TestClinit class
 *
 * @author devway
 * @date 2017-12-14
 */
public class TestClinit {
    public static void main(String[] args) {
        //由于父类的<clinit>()方法先执行，所以父类中的静态语句块要优先于子类执行，结果为2
        System.out.println(SubClinit.j);

    }
}

class Clinit{
    static int i=1;
    static{
        i=2;
    }
}
class SubClinit extends Clinit{
    static int j=i;
}
