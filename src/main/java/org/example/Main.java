package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.core.annotation.AnnotationConfigurationException;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Order order = context.getBean(Order.class);
        System.out.println(order.getName());
        System.out.println(order.getPrice());
        Barista barista = context.getBean(Barista.class);
        System.out.println(barista.getBaristaName());
        System.out.println(barista.getBaristaAge());
    }
}