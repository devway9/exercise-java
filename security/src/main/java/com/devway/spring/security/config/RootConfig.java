package com.devway.spring.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author devway
 * @date 2017-12-20
 */
@Configuration
@ComponentScan(basePackages = {"com.devway.spring"}, excludeFilters = {@ComponentScan.Filter(
        type = FilterType.ANNOTATION, value = EnableWebMvc.class
)})
public class RootConfig {
}
