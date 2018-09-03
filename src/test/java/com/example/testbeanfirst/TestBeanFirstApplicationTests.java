package com.example.testbeanfirst;

import com.example.testbeanfirst.component.ServiceA;
import com.example.testbeanfirst.component.ServiceB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBeanFirstApplicationTests {

    @Autowired
    private ServiceA serviceA;

    @Autowired
    private ServiceB serviceB;

    @Test
    public void contextLoads() {
    }

}
