package com.me.javaeight.lamdandfunctional;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    public int compare(T t1, T t2);

    static Comparator<Person> comparing(Function<Person, ? extends Comparable> f1) {
        return (p1,p2) -> f1.apply(p1).compareTo(f1.apply(p2));
    }
}
