package com.springhow.examples;

import com.springhow.examples.beans.Fruit;
import com.springhow.examples.beans.Juicer;
import com.springhow.examples.beans.impl.Apple;

public class NotAnIoCApplication {

    public static void main(String[] args) {
        Juicer juicer = new Juicer();
        Fruit fruit = new Apple();
        juicer.extractJuice(fruit);
    }
}
