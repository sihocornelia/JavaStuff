package com.me.designpatterns.factory;

public class MainClass {

    public static void main(String[] args) {
        try {
            VertebrateFactory.getVertebrate(Birds.TYPE).giveBirth();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
