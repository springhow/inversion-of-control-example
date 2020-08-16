package com.springhow.examples.beans.impl;

import com.springhow.examples.beans.Fruit;

public class Apple implements Fruit {

    @Override
    public String juice() {
        return "Here is Apple Juice";
    }
}
