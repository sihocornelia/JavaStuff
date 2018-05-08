package com.me.javaeight.collections;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        Person p1 = new Person("Name1", 1);
        Person p2 = new Person("Name2", 2);
        Person p3 = new Person("Name3", 3);
        Person p4 = new Person("Name4", 4);
        Person p5 = new Person("Name5", 5);

        List<Person> list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

        //list.removeIf(person -> person.getAge() < 3);
        //list.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
        list.sort(Comparator.comparing(Person::getAge).reversed());
        list.forEach(System.out::println);

        City city1 = new City("CityName1");
        City city2 = new City("CityName2");
        City city3 = new City("CityName3");

        Map<City, List<Person>> map1 = new HashMap<>();
        map1.putIfAbsent(city1, new ArrayList<>());
        map1.get(city1).add(p1);

        map1.computeIfAbsent(city1, city->new ArrayList<>()).add(p1);
        map1.computeIfAbsent(city2, city->new ArrayList<>()).add(p2);

        //System.out.println("Get persons from " + city1 + ":" + map1.getOrDefault(city1, Collections.EMPTY_LIST));
        //System.out.println("Get persons from " + city2 + ":" + map1.getOrDefault(city2, Collections.EMPTY_LIST));
        System.out.println("map1: ");
        map1.forEach((city, persons)-> System.out.println(city + ":" + persons));

        Map<City, List<Person>> map2 = new TreeMap<>();
        map2.computeIfAbsent(city2, city -> new ArrayList<>()).add(p3);
        map2.computeIfAbsent(city3, city -> new ArrayList<>()).add(p4);
        System.out.println("map2: ");
        map2.forEach((city, persons)-> System.out.println(city + ":" + persons));

        map2.forEach(
                (city, persons)->
                        map1.merge(
                                city, persons,
                                (personsFromMap1, personsFromMap2)->{
                                                                personsFromMap1.addAll(personsFromMap2);
                                                                return personsFromMap1;
                                                    })
                    );
        System.out.println("Resulting map1: ");
        map1.forEach((city, persons) -> System.out.println(city + ": " + persons));

    }
}
