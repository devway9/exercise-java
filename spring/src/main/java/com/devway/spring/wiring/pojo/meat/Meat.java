package com.devway.spring.wiring.pojo.meat;

import com.devway.spring.wiring.pojo.Product;

public interface Meat extends Product {
    @Override
    void printDesc();
}
