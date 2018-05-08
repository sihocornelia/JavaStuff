package com.me.designpatterns.singleton;

public class MainClass {

    public static void main(String[] args) {
        Singleton1 singletonInstance = Singleton1.getSingletonInstance();
        System.out.println("Singletoninstance is not null: " + (singletonInstance!=null));

        Singleton2 singletonInstance2 = Singleton2.getSingletonInstance();
        System.out.println("Singletoninstance is not null: " + (singletonInstance2!=null));

    }
}
