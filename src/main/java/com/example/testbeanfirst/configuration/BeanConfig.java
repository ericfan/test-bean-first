package com.example.testbeanfirst.configuration;

import com.example.testbeanfirst.component.ServiceA;
import com.example.testbeanfirst.component.ServiceB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Eric Fan
 *
 */
@Configuration
public class BeanConfig {

    @Bean
    ServiceA serviceA() {
        System.out.println("Initial ServiceA from Boot!!!!!!!!!!");
        return new ServiceA("Super","SE");
    }

    @Bean
    ServiceB serviceB() {
        System.out.println("Initial ServiceB from Boot!!!!!!!!!!");
        return new ServiceB("Eric",35);
    }
}
