package com.springhow.examples.beans.impl;

import com.springhow.examples.beans.Fruit;

public class Orange implements Fruit {


    @Override
    public String juice() {
        return "Here is Orange Juice";
    }
}
