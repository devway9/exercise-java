package com.devway.spring.wiring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author devway
 * @date 2017-12-19
 */
@Configuration
@Import({AutoWiringConfig.class,JavaWiringConfig.class})
@ImportResource("classpath:spring.xml")
public class MixWiringConfig {

}

