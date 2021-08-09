package com.projeto.binarytree;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public void add(T content){
        BinaryNode<T> newNode = new BinaryNode<>(content);
        this.root = add(root, newNode);
    }

    private BinaryNode<T> add(BinaryNode<T> currentNode, BinaryNode<T> newNode){
        if(currentNode == null){
            return newNode;
        }else if(newNode.getContent().compareTo(currentNode.getContent()) < 0){
            currentNode.setLeftNode(add(currentNode.getLeftNode(), newNode));
        }else{
            currentNode.setRightNode(add(currentNode.getRightNode(), newNode));
        }
        return currentNode;
    }

    public void showInOrder(){
        System.out.println("\n Showing in-order");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> current){
        if(current != null){
            showInOrder(current.getLeftNode());
            System.out.print(current.getContent() + ", ");
            showInOrder(current.getRightNode());
        }
    }

    public void showPostOrder(){
        System.out.println("\n Showing post-order");
        showInOrder(this.root);
    }

    private void showPostOrder(BinaryNode<T> current){
        if(current != null){
            showPostOrder(current.getLeftNode());
            showPostOrder(current.getRightNode());
            System.out.print(current.getContent() + ", ");
        }
    }

    public void showPreOrder(){
        System.out.println("\n Showing pre-order");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinaryNode<T> current){
        if(current != null){
            System.out.print(current.getContent() + ", ");
            showPreOrder(current.getLeftNode());
            showPreOrder(current.getRightNode());
        }
    }

    public void remove(T content){
        try{
            BinaryNode<T> current = this.root;
            BinaryNode<T> father = null;
            BinaryNode<T> son = null;
            BinaryNode<T> temp = null;

            while(current != null && !current.getContent().equals(content)){
                father = current;
                if(content.compareTo(current.getContent()) < 0){
                    current = current.getLeftNode();
                }else{
                    current = current.getRightNode();
                }
            }

            if(current == null){
                System.out.println("Content not found. Try block");
            }

            if(father == null){
                if(current.getRightNode() == null){
                    this.root = current.getLeftNode();
                }else if(current.getLeftNode() == null){
                    this.root = current.getRightNode();
                }else{
                    for(temp = current, son = current.getLeftNode();
                        son.getRightNode() != null;
                        temp = son, son = son.getLeftNode()
                    ){
                        if(son != current.getLeftNode()){
                            temp.setRightNode(son.getLeftNode());
                            son.setLeftNode(root.getLeftNode());
                        }
                    }
                    son.setRightNode(root.getRightNode());
                    root = son;
                }
            }else if(current.getRightNode() == null){
                if(father.getLeftNode() == current){
                    father.setLeftNode(current.getLeftNode());
                }else{
                    father.setRightNode(current.getLeftNode());
                }
            }else if(current.getLeftNode() == null){
                if(father.getLeftNode() == current){
                    father.setLeftNode(current.getRightNode());
                }else{
                    father.setRightNode(current.getRightNode());
                }
            }else{
                for(
                        temp = current, son = current.getLeftNode();
                        son.getRightNode() != null;
                        temp = son, son = son.getRightNode()
                ){
                    if(son != current.getLeftNode()){
                        temp.setRightNode(son.getLeftNode());
                        son.setLeftNode(current.getLeftNode());
                    }
                    son.setRightNode(current.getRightNode());
                    if(father.getLeftNode() == current){
                        father.setLeftNode(son);
                    }else{
                        father.setRightNode(son);
                    }
                }
            }

        }catch(NullPointerException error){
            System.out.println("Content not found. Catch block");
        }
    }

}
