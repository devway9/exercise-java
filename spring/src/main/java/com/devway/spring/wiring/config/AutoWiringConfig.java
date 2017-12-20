package com.devway.spring.wiring.config;

import com.devway.spring.wiring.pojo.fruit.Fruit;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author devway
 * @date 2017-12-19
 */
//@ComponentScan
@ComponentScan(basePackageClasses = {Fruit.class})
@Configuration
public class AutoWiringConfig {
}
