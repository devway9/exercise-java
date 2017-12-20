package com.devway.spring.wiring;

import com.devway.spring.wiring.config.MixWiringConfig;
import com.devway.spring.wiring.pojo.ShoppingCart;
import com.devway.spring.wiring.pojo.fruit.Apple;
import com.devway.spring.wiring.pojo.fruit.Fruit;
import com.devway.spring.wiring.pojo.meat.BeefMeat;
import com.devway.spring.wiring.pojo.meat.Meat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author devway
 * @date 2017-12-19
 */
public class MixJavaConfigWiringTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MixWiringConfig.class);
        Fruit fruit = (Fruit) context.getBean("apple");
        fruit.printDesc();
    }

}
