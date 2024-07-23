package Uebung9;

import Uebung8.DynArray;

import java.util.Iterator;

public class MengeDynArray<T> implements Menge<T> {

    /* Instanzvariablen */

    private DynArray<T> elements;

    /* Konstruktoren */

    public MengeDynArray() {
        elements = new DynArray<>();
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
    public T get() {
        return elements.get(0);
    }

    @Override
    public void insert(T e) {
        elements.add(e);
    }

    @Override
    public void delete(T e) {
        elements.delete(e);
    }

    @Override
    public boolean contains(T e) {
        return elements.contains(e);
    }

    @Override
    public String toString() {
        return "" + elements;
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
