package com.projeto.linkedlist;

public class LinkedList<T> {

    Node<T> refEntry;

    public LinkedList(){
        this.refEntry = null;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);

        if(this.isEmpty()){
            refEntry = newNode;
            return;
        }

        Node<T> auxNode = refEntry;
        for(int i = 0; i < this.size() - 1; i++){
            auxNode = auxNode.getNextNode();
        }

        auxNode.setNextNode(newNode);
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index){

        verifyIndex(index);

        Node<T> auxNode = refEntry;
        Node<T> returnNode = null;

        for(int i = 0; i <= index; i++){
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }

        return returnNode;
    }

    public T remove(int index){
        Node<T> pivotNode = this.getNode(index);
        if(index == 0){
            refEntry = pivotNode.getNextNode();
            return pivotNode.getContent();
        }

        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(pivotNode.getNextNode());
        return pivotNode.getContent();
    }

    public int size(){
        int listLen = 0;
        Node<T> refAux = refEntry;
        while(true){
            if(refAux != null){
                listLen++;
                if(refAux.getNextNode() != null){
                    refAux = refAux.getNextNode();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return listLen;
    }

    private void verifyIndex(int index){
        if(index >= size()){
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("There is not content in index " + index + " of this list. Last index: " + lastIndex);
        }
    }

    public boolean isEmpty(){
        return refEntry == null ? true : false;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> auxNode = refEntry;
        for(int i = 0; i < this.size(); i++){
            str += "LinkedList{content=" + auxNode.getContent() + "} --> ";
            auxNode = auxNode.getNextNode();
        }
        str += "null";
        return str;
    }
}
