package Uebung2;

import java.util.NoSuchElementException;

public class MengeLimited<T> implements Menge<T>{

    private  T[] array;
    private int size;



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public T get() throws NoSuchElementException {
        if (size ==0) {
            throw new NoSuchElementException ("Menge ist Leer !!!!");
        }
        return array[0];
    }

    @Override
    public void insert(T e) {
        if (this.contains(e))
            return;
        if (size >= array.length)
            throw new ArrayIndexOutOfBoundsException("Menge voll");
        array[size++] = e;
    }

    @Override
    public void delete(T e) {
        for (int i = 0; i < size; i++)
            if (e.equals ( array[i] )) {
                for (int j = i; j < size - 1; j++)
                    array[j] = array[j + 1];
                size--;
                return;
            }
    }
        @Override
    public boolean contains(T e) {
        for(int i = 0; i < size; i++)
            if(e.equals(array[i]))
                return true;
        return false;
    }
}
