package controllers;

import java.util.EmptyStackException;

import Models.Node;

public class Queue {
    private Node primero;
    private Node ultimo;
    private int size;

    public Queue(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    public void add(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            primero = newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;

    }
    public boolean isEmpty(){
        return primero == null;
    }
    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int aux = primero.getValue();
        primero = primero.getNext();
        return aux;
        
    }
    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return primero.getValue();
        
        

    }

}
