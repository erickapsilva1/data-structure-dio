package com.projeto.circularbuffer;

public class CircularBuffer<T> {

    private Node<T> head;
    private Node<T> tail;
    private int lenList;

    public CircularBuffer() {
        this.head = null;
        this.tail = null;
        this.lenList = 0;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if(this.lenList == 0){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(tail);
        }else{
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.lenList++;
    }

    public void remove(int index){
        if(index >= this.lenList)
            throw new IndexOutOfBoundsException("Index is greater than the length of the list");

        Node<T> auxNode = this.tail;
        if(index == 0){
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        }else if(index == 1){
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        }else{
            for(int i = 0; i < index-1; i++){
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
        }
        this.lenList--;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    private Node<T> getNode(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("List is empty");

        if(index == 0){
            return this.tail;
        }

        Node<T> auxNode = this.tail;
        for(int i = 0; (i < index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNode();
        }
        return auxNode;
    }

    public boolean isEmpty(){
        return this.lenList == 0 ? true : false;
    }

    public int size(){
        return this.lenList;
    }

    public String toString(){
        String str = "";

        Node<T> auxNode = this.tail;
        for(int i = 0; i < size(); i++){
            str += "[Node{content=" + auxNode.getContent() + "}] --> ";
            auxNode = auxNode.getNextNode();
        }
        str += this.size() != 0 ? "(back to the begging)" : "[]";

        return str;
    }

}
