package com.projeto.javaset;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Car> hashSetCars = new HashSet<>();

        hashSetCars.add(new Car("AMC"));
        hashSetCars.add(new Car("Cadillac"));
        hashSetCars.add(new Car("Dodge"));
        hashSetCars.add(new Car("GM"));
        hashSetCars.add(new Car("Chevrolet"));
        hashSetCars.add(new Car("Tucker"));
        hashSetCars.add(new Car("ZAP"));

        System.out.println(hashSetCars);

        Set<Car> treeSetCars = new TreeSet<>();

        treeSetCars.add(new Car("AMC"));
        treeSetCars.add(new Car("Cadillac"));
        treeSetCars.add(new Car("Dodge"));
        treeSetCars.add(new Car("GM"));
        treeSetCars.add(new Car("Chevrolet"));
        treeSetCars.add(new Car("Tucker"));
        treeSetCars.add(new Car("ZAP"));

        System.out.println(treeSetCars);

    }
}
