package com.frotscher.examples.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void testBuilder() {
        City frankfurt = new CityBuilder().setName("Frankfurt").setZip(60000).build();
        assertEquals("Frankfurt", frankfurt.getName());
        assertEquals(60000, (int) frankfurt.getZip());
    }
}
