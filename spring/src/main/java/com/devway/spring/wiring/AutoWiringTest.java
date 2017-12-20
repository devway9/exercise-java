package com.devway.spring.wiring;

import com.devway.spring.wiring.config.AutoWiringConfig;
import com.devway.spring.wiring.pojo.fruit.Apple;
import com.devway.spring.wiring.pojo.fruit.Fruit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author devway
 * @date 2017-12-19
 */
public class AutoWiringTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiringConfig.class);
        Fruit fruit = (Apple) context.getBean("apple");
        fruit.printDesc();
    }

}
