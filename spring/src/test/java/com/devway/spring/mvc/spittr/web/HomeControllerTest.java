package com.devway.spring.mvc.spittr.web;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author devway
 * @date 2017-12-20
 */
public class HomeControllerTest {
    @Test
    public void homeTest() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
       mockMvc.perform(get("/homepage")).andExpect(view().name("home"));
    }
}
