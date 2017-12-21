package com.devway.spring.mvc.spittr.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author devway
 * @date 2017-12-20
 */
public class Test {
    @RequestMapping(value = "/register3", method = RequestMethod.GET)
    public String showRegisterationForm() {
        return "registerForm";
    }

}
