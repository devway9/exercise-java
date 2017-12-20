package com.devway.spring.mvc.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author devway
 * @date 2017-12-20
 */
@Controller
@RequestMapping({"/home","/homepage"})
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
