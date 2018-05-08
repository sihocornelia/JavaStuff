package com.me.designpatterns.factory;

public class Mammals extends Vertebrate {

    public static final String TYPE = "mammal";

    @Override
    public void giveBirth() {
        System.out.println(this.getClass() + "give birth to live creatures");
    }

    @Override
    public String toString() {
        return "Mammals{}";
    }
}
