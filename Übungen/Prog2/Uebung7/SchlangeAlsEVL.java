package Uebung7;

import Uebung4.EVL;

import java.util.Iterator;

public class SchlangeAlsEVL <T> implements Schlange<T> {

    private EVL<T> elements;

    public SchlangeAlsEVL() {
        this.elements = new EVL<> ();
    }

    @Override
    public int size() {
        return elements.size ();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty ();
    }

    @Override
    public T front() {
        return elements.getFirst ();
    }

    @Override
    public void enqueue(T e) {
        elements.append ( e );
    }

    @Override
    public void dequeue() {
        elements.removeFirst ();
    }

    @Override
    public Iterator iterator() {
        return elements.iterator ();
    }
}