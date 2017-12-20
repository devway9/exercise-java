package com.devway.spring.wiring;

import com.devway.spring.wiring.config.ProfileConfig;
import com.devway.spring.wiring.pojo.fruit.Fruit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.java2d.cmm.Profile;

/**
 * @author devway
 * @date 2017-12-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ProfileConfig.class)
//@@ContextConfiguration("classpath:spring-profile.xml")
@ActiveProfiles("dev")
public class ProfileTest {
    @Autowired
    private Fruit fruit;

    @Test
    public void test(){
        fruit.printDesc();
    }
}
