package com.projeto.stack;

public class Stack {

    private Node nodeEntry;

    public Stack() {
        this.nodeEntry = null;
    }

    public boolean isEmpty(){
        return nodeEntry == null ? true : false;
    }

    public Node top(){
        return nodeEntry;
    }

    public void push(Node node){
        Node auxRef = nodeEntry;
        nodeEntry = node;
        nodeEntry.setNodeRef(auxRef);
    }

    public Node pop(){
        if (!this.isEmpty()){
            Node poppedNode = nodeEntry;
            nodeEntry = nodeEntry.getNodeRef();
            return poppedNode;
        }
        return null;
    }

    @Override
    public String toString(){
        String str = "-=-=-=-=-=-=-=-=-=\n";
              str += "       Stack\n";
              str += "-=-=-=-=-=-=-=-=-=\n";

        Node auxNode = nodeEntry;

        while (true){
            if(auxNode != null){
                str += "[Node{data=" + auxNode.getData() + "}]\n";
                auxNode = auxNode.getNodeRef();
            }else{
                break;
            }
        }
        str += "-=-=-=-=-=-=-=-=-=\n";
        return str;
    }
}
