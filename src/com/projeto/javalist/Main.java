package com.projeto.javalist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Jaguar"));
        carList.add(new Car("McLaren"));
        carList.add(new Car("Land Rover"));
        carList.add(new Car("Nissan"));
        carList.add(new Car("Honda"));

        System.out.println(carList.contains(new Car("Nissan")));
        System.out.println(carList.get(0));
        System.out.println(carList.indexOf(new Car("Honda")));

        System.out.println(carList.remove(2));
        System.out.println(carList);
    }
}
