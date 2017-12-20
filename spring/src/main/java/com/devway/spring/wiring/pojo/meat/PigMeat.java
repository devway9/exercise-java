package com.devway.spring.wiring.pojo.meat;

/**
 * @author devway
 * @date 2017-12-19
 */
public class PigMeat implements Meat {
    private double price;

    @Override
    public void printDesc() {
        System.out.println("This is pigmeat.");
    }

    public PigMeat() {
        System.out.println("PigMeat cons0");
    }

    public PigMeat(double price) {
        this.price = price;
        System.out.println("PigMeat cons1");
    }
}
