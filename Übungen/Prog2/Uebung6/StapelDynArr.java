package Uebung6;

import Uebung3.DynArray;

import java.util.Iterator;

public class StapelDynArr<T> implements Stapel<T>{
    private DynArray<T> elem;
    public StapelDynArr() {
        elem= new DynArray<> ();
    }

    @Override
    public int size() {
        return elem.size ();
    }

    @Override
    public boolean isEmpty() {
        return elem.isEmpty ();
    }

    @Override
    public T top() {
        return elem.getLast ();
    }

    @Override
    public void push(T e) {
        elem.add ( e );

    }

    @Override
    public void pop() {
        elem.removeLast ();
    }
    @Override
    public Iterator<T> iterator() {
        return elem.iterator();
    }
}
