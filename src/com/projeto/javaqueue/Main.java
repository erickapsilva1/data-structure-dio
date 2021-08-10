package com.projeto.javaqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Car> queueCars = new LinkedList<>();

        queueCars.add(new Car("Koenigsegg"));
        queueCars.add(new Car("Volvo"));
        queueCars.add(new Car("Scania"));

        System.out.println(queueCars.add(new Car("Toyota")));
        System.out.println(queueCars);

        System.out.println(queueCars.offer(new Car("Hyundai")));
        System.out.println(queueCars);

        System.out.println(queueCars.peek());
        System.out.println(queueCars);

        System.out.println(queueCars.poll());
        System.out.println(queueCars);

        System.out.println(queueCars.isEmpty());
        System.out.println(queueCars.size());

    }
}
