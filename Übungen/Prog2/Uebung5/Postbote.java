package Uebung5;

import java.util.Iterator;

public class Postbote<T> implements Iterator<T> {

    /* Instanzvariablen */

    private T[] array;
    private int i;

    /* Konstruktoren */

    Postbote(T[] array) {
        this.array = array;
        i = 1;
    }

    /* Instanzmethoden */

    @Override
    public boolean hasNext() {
        return i > 0;
    }

    @Override
    public T next() {
        T value = array[i];
        if (i % 2 == 1) {
            i += 2;
            if (i >= array.length) {
                i = array.length - (array.length % 2 == 1 ? 1 : 2);
            }
        }
        else {
            i -= 2;
        }
        return value;
    }
}
