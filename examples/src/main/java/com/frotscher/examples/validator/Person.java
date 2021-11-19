package com.frotscher.examples.validator;

public class Person {

    private String name;

    @Age(max = 100)
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


