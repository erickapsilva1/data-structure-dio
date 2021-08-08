package com.projeto.doublylinkednode;

public class DoublyLinkedNode<T> {

    private DoublyNode<T> firstNode;
    private DoublyNode<T> lastNode;

    private int lenList;

    public DoublyLinkedNode(){
        firstNode = null;
        lastNode = null;
        this.lenList = 0;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    public void add(T element){
        DoublyNode<T> newNode = new DoublyNode<>(element);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);
        if(firstNode == null){
            firstNode = newNode;
        }
        if(lastNode != null){
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        lenList++;
    }

    public void add(T element, int index){
        DoublyNode<T> auxNode = getNode(index);
        DoublyNode<T> newNode = new DoublyNode<>(element);
        newNode.setNextNode(auxNode);

        if(newNode.getNextNode() != null){
            newNode.setPreviousNode(auxNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        }else{
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }

        if(index == 0){
            firstNode = newNode;
        }else{
            newNode.getPreviousNode().setNextNode(newNode);
        }

        lenList++;

    }

    public void remove(int index){
        if(index == 0){
            firstNode = firstNode.getNextNode();
            if(firstNode != null){
                firstNode.setPreviousNode(null);
            }
        }else{
            DoublyNode<T> auxNode = getNode(index);
            auxNode.getPreviousNode().setNextNode(auxNode.getNextNode());
            if(auxNode != lastNode){
                auxNode.getNextNode().setPreviousNode(auxNode.getPreviousNode());
            }else{
                lastNode = auxNode;
            }
        }
        this.lenList--;
    }

    private DoublyNode<T> getNode(int index){
        DoublyNode<T> auxNode = firstNode;
        for(int i = 0; (i < index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNode();
        }
        return auxNode;
    }

    public int size(){
        return lenList;
    }

    public String toString(){
        String str = "";
        DoublyNode<T> auxNode = firstNode;
        for(int i = 0; i < size(); i++){
            str += "[Node{content=" + auxNode.getContent() + "}] --> ";
            auxNode = auxNode.getNextNode();
        }
        str += "null";
        return str;
    }

}
