package com.devway.spring.wiring.config;

import com.devway.spring.wiring.pojo.fruit.Apple;
import com.devway.spring.wiring.pojo.fruit.Fruit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author devway
 * @date 2017-12-19
 */
@Configuration
public class ProfileConfig {

    @Bean("apple")
    @Profile("dev")
    public Fruit getDevFruit() {
        Apple apple = new Apple();
        apple.setDesc("Dev JavaConfig init");
        return apple;
    }


    @Bean("apple")
    @Profile("prd")
    public Fruit getPrdFruit() {
        Apple apple = new Apple();
        apple.setDesc("Prd JavaConfig init");
        return apple;
    }
}
