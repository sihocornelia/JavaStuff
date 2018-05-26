package com.me.javaeight.streams;

import com.me.javaeight.collections.City;

import java.util.Arrays;
import java.util.List;

public class Streams {

    private static City[] arrayCities  = {
            new City("City1"),
            new City("City2"),
            new City("City3")
    };

    public static void main(String[] args) {
        List<City> empList = Arrays.asList(arrayCities);
        empList.forEach(System.out::println);
        //change2 - haha

    }

}
