package com.me.designpatterns.factory;

public class Birds extends Vertebrate {

    public static final String TYPE = "bird";

    @Override
    public void giveBirth() {
        System.out.println(this.getClass() + " lay eggs");
    }

    @Override
    public String toString() {
        return "Birds{}";
    }
}
