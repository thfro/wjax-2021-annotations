package com.frotscher.examples.validator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidatorTest {

    @Test
    public void testValidator() throws IllegalAccessException {
        Person p = new Person("Alice", 65);
        assertTrue(AgeValidator.validate(p));
    }
}
