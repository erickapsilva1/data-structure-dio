package com.projeto.queue;

public class Queue<T> {

    private Node<T> refEntry;

    public Queue() {
        this.refEntry = null;
    }

    public T first(){
        if(!this.isEmpty()){
            Node first = refEntry;
            while (true){
                if(first.getRefNode() != null){
                    first = first.getRefNode();
                }else{
                    break;
                }
            }
            return (T) first.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node first = refEntry;
            Node auxNode = refEntry;
            while (true){
                if(first.getRefNode() != null){
                    auxNode = first;
                    first = first.getRefNode();
                }else{
                    auxNode.setRefNode(null);
                    break;
                }
            }
            return (T) first.getObject();
        }
        return null;
    }

    public void enqueue(T obj){
        Node newNode = new Node(obj);
        newNode.setRefNode(refEntry);
        refEntry = newNode;
    }

    public boolean isEmpty(){
        return refEntry == null ? true : false;
    }

    @Override
    public String toString() {
        String str = "";
        Node auxNode = refEntry;

        if(refEntry != null){
            while(true){
                str += "[Node{object=" + auxNode.getObject() + "}] --> ";
                if(auxNode.getRefNode() != null){
                    auxNode = auxNode.getRefNode();
                }else{
                    str += "null";
                    break;
                }
            }
        }else{
            str = "null";
        }
        return str;
    }
}
