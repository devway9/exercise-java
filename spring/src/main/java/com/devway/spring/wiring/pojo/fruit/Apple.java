package com.devway.spring.wiring.pojo.fruit;

import org.springframework.stereotype.Component;

/**
 * @author devway
 * @date 2017-12-19
 */
@Component
public class Apple implements Fruit {

    private double price;
    private String desc = "default";


    public Apple() {
        System.out.println("Apple cons0 ");
    }

    public Apple(double price) {
        this.price = price;
        System.out.println("Apple cons1 " + price);
    }

    public Apple(double price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("Apple cons2 " + price + " " + desc);
    }

    @Override
    public void printDesc() {
        System.out.println("This is apple,desc:" + desc);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
