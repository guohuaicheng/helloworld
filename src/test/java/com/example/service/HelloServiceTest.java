package com.example.service;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by G on 2016/10/11.
 */
public class HelloServiceTest {
    @Test
    public void testHello() throws Exception {
        HelloService helloService = new HelloService();
        Assert.assertEquals("hello world", helloService.hello());
    }
}
