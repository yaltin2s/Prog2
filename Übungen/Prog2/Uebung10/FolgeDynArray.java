package Uebung10;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class FolgeDynArray<T> implements Folge<T> {

    /* Instanzvariablen */

    private final DynArray<T> elements;

    /* Konstruktoren */

    public FolgeDynArray() {
        this.elements = new DynArray<>();
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
    public boolean contains(T e) {
        return elements.contains(e);
    }

    @Override
    public T get(int pos) throws IndexOutOfBoundsException {
        return elements.get(pos);
    }

    @Override
    public void set(int pos, T e) throws IndexOutOfBoundsException {
        elements.set(pos, e);
    }

    @Override
    public int pos(T e) throws NoSuchElementException {
        for (int i = 0; i < size(); i++) {
            if (elements.get(i).equals(e)) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public void insert(int pos, T e) throws IndexOutOfBoundsException {
        elements.add(e);
        for (int i = size() - 1; i > pos; i--) {
            T tmp = elements.get(i - 1);
            elements.set(i - 1, elements.get(i));
            elements.set(i, tmp);
        }
    }

    @Override
    public void addFirst(T e) {
        insert(0, e);
    }

    @Override
    public void addLast(T e) {
        elements.add(e);
    }

    @Override
    public void delete(T e) {
        elements.delete(e);
    }

    @Override
    public void remove(int pos) throws IndexOutOfBoundsException {
        elements.remove(pos);
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
