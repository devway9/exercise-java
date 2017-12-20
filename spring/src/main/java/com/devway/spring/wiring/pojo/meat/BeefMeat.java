package com.devway.spring.wiring.pojo.meat;

/**
 * @author devway
 * @date 2017-12-19
 */
public class BeefMeat implements Meat {
    private double price;

    @Override
    public void printDesc() {
        System.out.println("This is beefmeat.");
    }

    public BeefMeat() {
        System.out.println("BeefMeat cons0");
    }

    public BeefMeat(double price) {
        this.price = price;
        System.out.println("BeefMeat cons1");
    }

}
