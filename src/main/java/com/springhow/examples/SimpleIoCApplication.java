package com.springhow.examples;

import com.springhow.examples.beans.Fruit;
import com.springhow.examples.beans.Juicer;

import java.io.InputStream;
import java.util.Properties;

public class SimpleIoCApplication {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream inputStream
                = SimpleIoCApplication.class.getResourceAsStream("/config.properties");
        properties.load(inputStream);
        Juicer juicer = new Juicer();
        Class<?> fruitClass
                = Class.forName(properties.getProperty("fruit.class.name"));
        Fruit fruit = (Fruit) fruitClass.newInstance();
        juicer.extractJuice(fruit);
    }
}
