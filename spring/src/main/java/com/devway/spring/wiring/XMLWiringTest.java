package com.devway.spring.wiring;

import com.devway.spring.wiring.pojo.ShoppingCart;
import com.devway.spring.wiring.pojo.fruit.Fruit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author devway
 * @date 2017-12-19
 */
public class XMLWiringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Fruit fruit = (Fruit) context.getBean("apple");
        fruit.printDesc();

        Fruit fruit2 = (Fruit) context.getBean("apple");
        fruit2.printDesc();
        System.out.println(fruit == fruit2);


    }

}
