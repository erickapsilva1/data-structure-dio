package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA: " + intA + " | " + "intB: " + intB);
        intA = 2;
        System.out.println("intA: " + intA + " | " + "intB: " + intB);

        MyObj myObjA = new MyObj(1);
        MyObj myObjB = myObjA;

        System.out.println("myObjA: " + myObjA + " | " + "myObjB: " + myObjB);
        myObjA.setNumber(2);
        System.out.println("myObjA: " + myObjA + " | " + "myObjB: " + myObjB);

    }
}
