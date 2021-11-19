package com.frotscher.examples.builder;

public class City {

    private String name;
    private Integer zip;

    public String getName() {
        return name;
    }

    @BuilderProperty
    public void setName(String name) {
        this.name = name;
    }

    public Integer getZip() {
        return zip;
    }

    @BuilderProperty
    public void setZip(Integer zip) {
        this.zip = zip;
    }
}
