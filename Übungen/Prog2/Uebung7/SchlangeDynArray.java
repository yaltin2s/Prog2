package Uebung7;

import Uebung3.DynArray;

import java.util.Iterator;


public class SchlangeDynArray<T> implements Schlange<T> {


    private DynArray<T> elements;


    public SchlangeDynArray() {
        elements = new DynArray<>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public T front() {
        return elements.get(0);
    }

    @Override
    public void enqueue(T e) {
        elements.add(e);
    }

    @Override
    public void dequeue() {
        elements.remove(0);
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