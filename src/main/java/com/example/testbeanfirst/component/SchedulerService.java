package com.example.testbeanfirst.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerService.class);

    private ServiceA serviceA;

    private ServiceB serviceB;

    public SchedulerService(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    @Scheduled(fixedRate = 2000l)
    public void scheduleTaskWithFixedRate() {
        logger.info(serviceA.toString() + "****************");
        logger.info(serviceB.toString() + "****************");
    }
}
