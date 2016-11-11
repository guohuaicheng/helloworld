package com.example.service;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by G on 2016/10/11.
 */
public class WorldServiceTest {
    @Test
    public void testWorld() {
        Assert.assertEquals("world", new WordService().world());
    }
}
