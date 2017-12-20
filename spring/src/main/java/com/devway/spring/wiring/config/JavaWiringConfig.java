package com.devway.spring.wiring.config;

import com.devway.spring.wiring.pojo.ShoppingCart;
import com.devway.spring.wiring.pojo.fruit.Fruit;
import com.devway.spring.wiring.pojo.fruit.Apple;
import com.devway.spring.wiring.pojo.meat.BeefMeat;
import com.devway.spring.wiring.pojo.meat.Meat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @author devway
 * @date 2017-12-19
 */
@Configuration
public class JavaWiringConfig {
    @Bean("apple")
    public Fruit getFruit() {
        Apple apple = new Apple();
        apple.setDesc("JavaConfig init");
        return apple;
    }

    @Bean
    public Meat getMeat() {
        return new BeefMeat();
    }

    @Bean
    public ShoppingCart getShoppingCart() {
        return new ShoppingCart();
    }
}
