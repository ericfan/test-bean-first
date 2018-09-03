package com.example.testbeanfirst.integration.configuration;

import com.example.testbeanfirst.component.ServiceA;
import com.example.testbeanfirst.component.ServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Eric Fan
 */
@TestConfiguration
public class BeanConfig {

    private static final Logger logger = LoggerFactory.getLogger(BeanConfig.class);

    @Bean
    ServiceA serviceA() {
        logger.info("Initial ServiceA from Test############");
        return new ServiceA("SuperTest","SETest");
    }

    @Bean
    ServiceB serviceB() {
        logger.info("Initial ServiceB from Test#############");
        return new ServiceB("EricTest",35);
    }
}
