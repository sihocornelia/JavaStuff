package com.me.designpatterns.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VertebrateFactory {

    private final static Logger LOGGER = Logger.getLogger(VertebrateFactory.class.getName());

    public static Vertebrate getVertebrate(String type) throws Exception {
        LOGGER.log(Level.INFO, "searching for: " + type);
        switch (type) {
            case Birds.TYPE: return new Birds();
            case Mammals.TYPE: return new Mammals();
            default: throw new Exception("Vertebrate not found");
        }
    }

}
