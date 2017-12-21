package com.devway.spring.mvc.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author devway
 * @date 2017-12-20
 */
@Configuration
@ComponentScan(basePackages = {"com.devway.spring.mvc.spittr"}, excludeFilters = {@ComponentScan.Filter(
        type = FilterType.ANNOTATION, value = EnableWebMvc.class
)})
public class RootConfig {
}
