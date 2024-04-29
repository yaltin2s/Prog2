package Uebung3;

import Uebung2.Menge;

public class MengeDynArray implements Menge {

    private DynArray<Object> menge =new DynArray<> ();

    @Override
    public int size() {
        return menge.size ();
    }

    @Override
    public boolean isEmpty() {
        return menge.isEmpty ();
    }

    @Override
    public Object get() {
        return menge.toString ();
    }

    @Override
    public void insert(Object e) {
        menge.add ( e );
    }

    @Override
    public void delete(Object e) {
        menge.delete (e);
    }

    @Override
    public boolean contains(Object e) {
        return menge.contains (e);
    }
}
