package com.me.javaeight.functionalinterfaces;

@FunctionalInterface
public interface Predicate<T> {

    static <U> Predicate<U> isEquals(U aTry) {
        return s -> s.equals(aTry);
    }

    public boolean test(T s);

    public default Predicate<T> and(Predicate<T> function1) {
        return s -> test(s) && function1.test(s);
    }

    public default Predicate<T> or(Predicate<T> function1) {
        return s -> test(s) || function1.test(s);
    }
}
