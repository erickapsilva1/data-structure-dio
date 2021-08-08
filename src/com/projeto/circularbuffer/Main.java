package com.projeto.circularbuffer;

public class Main {
    public static void main(String[] args) {
        CircularBuffer<String> myCircularBuffer = new CircularBuffer<String>();

        myCircularBuffer.add("c0");
        System.out.println(myCircularBuffer);

        myCircularBuffer.remove(0);
        System.out.println(myCircularBuffer);

        myCircularBuffer.add("c1");
        System.out.println(myCircularBuffer);

        myCircularBuffer.add("c2");
        myCircularBuffer.add("c3");
        System.out.println(myCircularBuffer);

        System.out.println(myCircularBuffer.get(2));
        System.out.println(myCircularBuffer.get(0));

        System.out.println(myCircularBuffer.size());

        for(int i = 0; i < 20; i++){
            System.out.println(myCircularBuffer.get(i));
        }

    }
}
