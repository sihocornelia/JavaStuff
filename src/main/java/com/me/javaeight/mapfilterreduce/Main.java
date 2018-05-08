package com.me.javaeight.mapfilterreduce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;



public class Main {

    public static void main(String[] args){
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        BinaryOperator<Integer> sumFunct = (a, b) -> a + b;

        Integer sum = reduce(ints, 0, sumFunct);
        System.out.println("Sum: " + sum);
    }

    private static Integer reduce(List<Integer> ints, Integer initValue, BinaryOperator<Integer> sumFunct) {
        Integer result = initValue;
        for(Integer i:ints) {
            result = sumFunct.apply(result, i);
        }
        return result;
    }
}
