package com.example.testbeanfirst.integration.configuration;

import com.example.testbeanfirst.component.ServiceA;
import com.example.testbeanfirst.component.ServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Eric Fan
 */
@Configuration
public class BeanConfig {
    private static final Logger logger = LoggerFactory.getLogger(BeanConfig.class);


    @Bean
    ServiceA serviceA() {
        logger.info("Initial ServiceA from Boot!!!!!!!!!!");
        return new ServiceA("Super", "SE");
    }

    @Bean
    ServiceB serviceB() {
        logger.info("Initial ServiceB from Boot!!!!!!!!!!");
        return new ServiceB("Eric", 35);
    }
}
