package Uebung10;

import java.util.Iterator;

public class DynArray<T> implements Iterable<T> {

    private static int startGroesse = 2; // Länge des Arrays (initial)

    private T[] array;
    private int size; // Anzahl der "belegten" Plätze


    @SuppressWarnings("unchecked")
    public DynArray() {
        array =  (T[]) new Object[startGroesse];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int pos, T e) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();
        array[pos]= e;
    }

    public T get(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();
        return array[pos];
    }

    public void add(T e) {
        if(size >= array.length)
            increase();
        array[size++] = e;
    }

    public String toString() {
        String  s = "";
        for (int i = 0; i < size; i++)
            s = s + array[i] + " ";
        return s;
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        T[] neu = (T[]) new Object[array.length*2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
    }

    protected void show() {
        System.out.println("size\t length\t Array-Inhalt");
        System.out.print(size + "\t" + array.length + "\t");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
        System.out.println();
    }

    public void remove(int pos) {
        if (pos < 0 || pos >= size) return;

        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        decrease();
    }

    public void remove() {
        remove(0);
    }

    public void delete(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                remove(i);
                return;
            }
        }
    }

    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private void decrease() {
        if (size > array.length / 4) return;

        T[] neu = (T[]) new Object[array.length/2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
    }

    @Override
    public Iterator<T> iterator() {
        return new DynArrayIterator();  // Innere Klasse: Elementklasse
    }

    /* Innere Klasse */

    private class DynArrayIterator implements Iterator<T> {

        /* Instanzvariablen */

        int i;

        /* Konstruktoren */

        DynArrayIterator() {
            i = 0;
        }

        /* Instanzmethoden */

        @Override
        public boolean hasNext() {
            return i < size;
        }

        @Override
        public T next() {
            return array[i++];
        }
    }
}

