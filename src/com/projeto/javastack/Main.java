package com.projeto.javastack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Car> stackCars = new Stack<>();

        stackCars.push(new Car("Maserati"));
        stackCars.push(new Car("Toyota"));
        stackCars.push(new Car("Koenigsegg"));

        System.out.println(stackCars);
        System.out.println(stackCars.pop());
        System.out.println(stackCars);

        System.out.println(stackCars.peek());
        System.out.println(stackCars);

        System.out.println(stackCars.empty());

    }
}
