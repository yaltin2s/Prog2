package Uebung6;

import Uebung4.EVL;

import java.util.Iterator;


public class StapelEVL<T> implements Stapel<T> {

    /* Instanzvariablen */

    private EVL<T> elements;

    /* Konstruktoren */

    public StapelEVL() {
        elements = new EVL<>();
    }

    /* Instanzmethoden */

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public T top() {
        return elements.getLast();
    }

    @Override
    public void push(T e) {
        elements.append(e);
    }

    @Override
    public void pop() {
        elements.removeLast();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}