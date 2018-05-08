package com.me.javaeight;

import com.me.javaeight.functionalinterfaces.Predicate;
import com.me.javaeight.lamdandfunctional.Comparator;
import com.me.javaeight.lamdandfunctional.Person;

import java.util.function.Function;


public class Main {

    public static void main(String[] args) {

        example();

        Main m = new Main();
        m.example1();

        Predicate<String> function = s -> s.length() < 20;
        System.out.println("1. = " + function.test("Word"));

        Predicate<String> function1 = s -> s.length() > 5;
        System.out.println("2. = " + function1.test("Word"));

        Predicate<String> function3 = function.and(function1);
        System.out.println("3. = " + function3.test("Word"));

        Predicate<String> function4 = function.or(function1);
        System.out.println("4. = " + function4.test("Word"));

        Predicate<String> function5 = Predicate.isEquals("Try");
        System.out.println("5. = " + function5.test("Try"));

        Predicate<Integer> function6 = Predicate.isEquals(12);
        System.out.println("6. = " + function6.test(13));
    }

    private static void example() {
        Comparator<Person> comp = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> compfName = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> compLName = (p1,p2) -> p1.getLastName().compareTo(p2.getLastName());

        Function<Person, Integer> f1 = p1 -> p1.getAge();
        Function<Person, String> f2 = p1 -> p1.getFirstName();
        Function<Person, String> f3 = p1 -> p1.getLastName();

        Comparator<Person> c11 = Comparator.comparing(f1);
        Comparator<Person> c12 = Comparator.comparing(Person::getAge);
        Comparator<Person> c2 = Comparator.comparing(Person::getFirstName);
        Comparator<Person> c3 = Comparator.comparing(Person::getLastName);
    }

    public void example1() {
        Function<String, String> f = p -> p + ".";
        System.out.println(useFunction("test", f));
    }

    private String useFunction(String param, Function<String,String> f) {
        return f.apply(param);
    }
}
