package com.example.testbeanfirst.configuration;

import com.example.testbeanfirst.component.ServiceA;
import com.example.testbeanfirst.component.ServiceB;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author Eric Fan
 */
@TestConfiguration
public class BeanConfig {

    @Bean
    ServiceA serviceA() {
        System.out.println("Initial ServiceA from Test############");
        return new ServiceA("SuperTest","SETest");
    }

    @Bean
    ServiceB serviceB() {
        System.out.println("Initial ServiceB from Test#############");
        return new ServiceB("EricTest",35);
    }
}
