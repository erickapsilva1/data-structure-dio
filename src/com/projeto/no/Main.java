package com.projeto.no;

public class Main {
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("Content 1");
        Node<Integer> node2 = new Node<Integer>(3);

        node1.setNextNode(node2);

        Node<String> node3 = new Node<>("Content 3");
        node2.setNextNode(node3);

        Node<String> node4 = new Node<>("Content 4");
        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node2.getNextNode());
        System.out.println(node3.getNextNode());
        System.out.println(node4.getNextNode());

        System.out.println(node1.getNextNode()
                                .getNextNode()
                                .getNextNode()
                                .getNextNode());

    }
}
