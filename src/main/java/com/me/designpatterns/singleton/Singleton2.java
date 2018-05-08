package com.me.designpatterns.singleton;

//thread safe singleton
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {};

    public static Singleton2 getSingletonInstance() {
        if(instance == null){
            synchronized (Singleton2.class) {
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

}
