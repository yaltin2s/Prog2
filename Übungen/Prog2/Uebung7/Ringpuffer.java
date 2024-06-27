package Uebung7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class Ringpuffer<T> implements Iterable<T> {
    protected int capacity ;
    protected int size;

    public Ringpuffer(int capacity) throws IllegalArgumentException {
        if(capacity<=0)
            throw new IllegalArgumentException ("Negative Capacity");
        this.capacity = capacity;
        this.size= 0;
    }

    public int Capacity() {
        return capacity;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty (){
        return (size==0);
    }
    public boolean contains (T e){
        for(T t : this) {
            if (t.equals ( e ))
                return true;
        }
        return false;
    }

    public abstract T get() throws NoSuchElementException;

    public abstract void add(T e) throws IllegalStateException;

    public abstract void remove();

    public abstract Iterator<T> iterator();
}
