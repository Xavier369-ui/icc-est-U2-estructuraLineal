package controllers;




import java.util.NoSuchElementException;

import Models.NodeGeneric;
import Models.Persona;

public class QueueG <T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public QueueG(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        size--;
        if (primero == null) {
            ultimo = null; // La cola quedó vacía
        }
        return aux;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return primero.getValue();
    }

    public int size() {
        return size;
    }

    public void printCola() {
        NodeGeneric<T> current = primero;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public Persona findByName(String nombre) {
        NodeGeneric<T> current = primero;
        while (current != null) {
            if (current.getValue() instanceof Persona) {
                Persona persona = (Persona) current.getValue();
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    return persona;
                }
            }
            current = current.getNext(); 
        }
        return null;
    }
    public Persona deleteByName(String nombre) {
        NodeGeneric<T> current = primero;
        NodeGeneric<T> previous = null;

        while (current != null) {
            if (current.getValue() instanceof Persona) {
                Persona persona = (Persona) current.getValue();
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    if (previous == null) { // Está al principio
                        primero = current.getNext();
                        if (primero == null) {
                            ultimo = null; // la cola quedó vacía
                        }
                    } else {
                        previous.setNext(current.getNext());
                        if (current == ultimo) {
                            ultimo = previous;
                        }
                    }
                    size--;
                    return persona;
                }
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }

    

    

}
