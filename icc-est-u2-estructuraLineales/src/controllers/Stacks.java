package controllers;

import java.util.EmptyStackException;



import Models.NodeGeneric;

public class Stacks <T> {
    private NodeGeneric<T> top;
    private int size;

    public  Stacks(){
        this.top = null;
        this.size = 0;
    }
    public int push(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
        return size;
    }
    public T pop(){
         if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
     public boolean isEmpty() {
        return top == null;
    }

    public T peek(){
         if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }
    public void printStacks() {
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public int size() {
        return size;
       
        
    }

}
