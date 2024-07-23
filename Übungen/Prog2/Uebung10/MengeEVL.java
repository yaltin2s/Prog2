package Uebung10;

import java.util.Iterator;

/**
 * Datenstruktur (DS): Menge basierend auf einfach verketteter Liste (EVL)
 * @author akless
 * @licence MIT
 */
public class MengeEVL<T> implements Menge<T> {

    /* Instanzvariablen */

    private EVL<T> elements;

    /* Konstruktoren */

    public MengeEVL() {
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
    public T get() {
        return elements.getFirst();
    }

    @Override
    public void insert(T e) {
        if (contains(e)) return;

        elements.insert(e);
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