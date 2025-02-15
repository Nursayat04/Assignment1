package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {

    @Bean
    Order order() {
        Order order = new Order();
        order.setName("Latte");
        order.setPrice(25);
        return order;
    }

    @Bean
    Barista barista() {
        Barista barista = new Barista();
        barista.setBaristaName("Nursayat");
        barista.setBaristaAge(18);
        return barista;
    }
}
