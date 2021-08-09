package com.projeto.equalsandhashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> brandList = new ArrayList<>();

        brandList.add(new Car("Hyundai"));
        brandList.add(new Car("Volkswagen"));
        brandList.add(new Car("Toyota"));

        System.out.println(brandList.contains(new Car("Toyota")));
        System.out.println(new Car("Hyundai").hashCode()
                + " | "
                + new Car("Toyota").hashCode());

        Car car1 = new Car("Mustang");
        Car car2 = new Car("Maserati");
        Car car3 = new Car("Maserati");

        System.out.println(car1.equals(car2));
        System.out.println(car3.equals(car2));
    }
}
