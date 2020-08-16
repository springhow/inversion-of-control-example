package com.springhow.examples.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Juicer {
    private static final Logger log = LoggerFactory.getLogger(Juicer.class);

    public void extractJuice(Fruit fruit) {
        String juice = fruit.juice();
        log.info(juice);
    }
}
