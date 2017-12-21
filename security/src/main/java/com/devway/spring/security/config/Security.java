package com.devway.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * @author devway
 * @date 2017-12-21
 */
@Configuration
@EnableWebMvcSecurity
public class Security extends WebSecurityConfigurerAdapter{
    @Autowired
    DataSource dataSource;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       /* auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and()
                .withUser("admin").password("password").roles("USER","ADMIN");*/
       auth.jdbcAuthentication().dataSource(dataSource);
    }

}
