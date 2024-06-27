package Uebung7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RingbufferFIFO<T> extends Ringpuffer<T>{

    private T[] arr;
    private int p;

    @SuppressWarnings("unchecked")
    public RingbufferFIFO(int capacity) throws IllegalArgumentException {
        super ( capacity );
        this.arr = (T[]) new Object[capacity];
        this.p= 0;
    }

    @Override
    public T get() throws NoSuchElementException {
        if(isEmpty ()) throw  new NoSuchElementException ("Leer");
        return arr[p];
    }

    @Override
    public void add(T e) throws IllegalStateException {
        int i=((size++)+p)%capacity;
        arr[i]=e;
    }

    @Override
    public void remove() {
        if (size > 0) {
            p = (p+1) % capacity;
            size--;
        }

    }
    class RPIterator implements Iterator<T> {
        int i = 0;

        @Override
        public boolean hasNext() {
            return (i < size);
        }

        @Override
        public T next() {
            return arr[(p + i++) % capacity];
        }
    }

    @Override
    public Iterator iterator() {
        return new RPIterator ();
    }

    public void showArr() {
        String s = "";
        for (int i = 0; i < arr.length; i++)
            s = s + " " + arr[i];
        s = s+ "\tp: " + p + "\tsize: " + size;
        System.out.println(s);
    }

}