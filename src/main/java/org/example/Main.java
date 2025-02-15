package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.core.annotation.AnnotationConfigurationException;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    }
}