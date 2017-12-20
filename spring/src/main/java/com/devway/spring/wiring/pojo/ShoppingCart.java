package com.devway.spring.wiring.pojo;

import com.devway.spring.wiring.pojo.fruit.Fruit;
import com.devway.spring.wiring.pojo.meat.Meat;

import java.util.List;

/**
 * @author devway
 * @date 2017-12-19
 */
public class ShoppingCart {

    private String desc;
    private List<String> cardList;

    public ShoppingCart() {
        System.out.println("ShoppingCart cons0");
    }

    public ShoppingCart(String desc) {
        System.out.println("ShoppingCart cons1");
    }

    public ShoppingCart(Fruit fruit, Meat meat) {
        System.out.println("ShoppingCart cons2");
    }

    public ShoppingCart(Fruit fruit, Meat meat, List<String> list) {
        System.out.println("ShoppingCart cons3");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public ShoppingCart(Fruit fruit, Meat meat, String str, int num) {
        System.out.println("ShoppingCart cons4 ");

    }

    public List<String> getCardList() {
        return cardList;
    }

    public void setCardList(List<String> cardList) {
        this.cardList = cardList;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
