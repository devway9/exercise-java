package com.devway.spring.wiring;

import static org.junit.Assert.*;

import com.devway.spring.wiring.config.JavaWiringConfig;
import com.devway.spring.wiring.pojo.fruit.Fruit;
import com.devway.spring.wiring.pojo.meat.Meat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author devway
 * @date 2017-12-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring2.xml")
public class MixXMLWiringTest {
    @Autowired
    private Fruit fruit;

    @Test
    public void test() {
        assertNotNull(fruit);
        fruit.printDesc();
    }
}
