package Uebung7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RingpufferLIFO<T> extends Ringpuffer<T>{

    private T[] elements;
    private int p;

    public RingpufferLIFO(int capacity) throws IllegalArgumentException {
        super ( capacity );
        this.elements = (T[]) new Object[capacity];
        p=-1;
    }

    @Override
    public T get() throws NoSuchElementException {
        if (isEmpty ()) throw new NoSuchElementException ("Leer");
        return elements[(size+p)%capacity];
    }

    @Override
    public void add(T e) throws IllegalStateException {
        elements[(p+size+1)%capacity]=e;
        if (size < capacity) {
            size++;
        } else {
            p = (p + 1) % capacity;
        }
    }

    @Override
    public void remove() {
        if (isEmpty ()) return;
        p = (p+1)%capacity;
        size--;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<T>() {

            private int i = (p + size + 1) % capacity;
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return (counter < size);
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();

                T wert = elements[i];
                i = (i - 1 + size) % capacity;
                counter++;
                return wert;
            }
        };
    }
}
