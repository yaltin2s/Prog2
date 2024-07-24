package Uebung11;

public interface Schlange<T> extends Iterable<T> {

    int size();

    boolean isEmpty();

    T front();

    void enqueue(T e);

    void dequeue();
}