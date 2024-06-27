package Uebung7;

import java.util.Iterator;

public class SchlangeAlsRingpuffe <T> implements Schlange<T> {

    private Ringpuffer<T> elements;

    public SchlangeAlsRingpuffe(int c) {
        this.elements = new RingbufferFIFO<> ( c );
    }

    @Override
    public int size() {
        return elements.Size ();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty ();
    }

    @Override
    public T front() {
        return elements.get ();
    }

    @Override
    public void enqueue(T e) {
        elements.add(  e );
    }

    @Override
    public void dequeue() {
    elements.remove ();
    }

    @Override
    public Iterator iterator() {
        return elements.iterator ();
    }
}

