package com.frotscher.examples.validator;

import java.lang.reflect.Field;

public class AgeValidator {

    public static boolean validate(Object object) throws IllegalAccessException {

        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            Age ageAnnotation = field.getAnnotation(Age.class);

            if (ageAnnotation!=null) {
                int minAge = ageAnnotation.min();
                int maxAge = ageAnnotation.max();

                field.setAccessible(true);
                int age = field.getInt(object);

                return (age >= minAge && age <= maxAge);
            }
        }

        return true;
    }

}
