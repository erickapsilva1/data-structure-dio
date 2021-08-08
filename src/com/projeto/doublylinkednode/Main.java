package com.projeto.doublylinkednode;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedNode<String> myDoublyLinkedNode = new DoublyLinkedNode<String>();

        myDoublyLinkedNode.add("c1");
        myDoublyLinkedNode.add("c2");
        myDoublyLinkedNode.add("c3");
        myDoublyLinkedNode.add("c4");
        myDoublyLinkedNode.add("c5");
        myDoublyLinkedNode.add("c6");
        myDoublyLinkedNode.add("c7");

        System.out.println(myDoublyLinkedNode);

        myDoublyLinkedNode.remove(3);
        System.out.println(myDoublyLinkedNode);

        myDoublyLinkedNode.add("66");
        System.out.println(myDoublyLinkedNode);

        myDoublyLinkedNode.add("99",0);
        System.out.println(myDoublyLinkedNode);

        System.out.println(myDoublyLinkedNode.size());

    }
}
