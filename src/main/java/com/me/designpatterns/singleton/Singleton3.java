package com.me.designpatterns.singleton;

public class Singleton3 {

    private Singleton3(){}

    //SingletonHelper not loaded into memory (only when someone calls the getInstance)
    private static class SingletonHelper{
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
