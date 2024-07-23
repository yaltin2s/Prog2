package Uebung10;

public interface Menge<T> extends Iterable<T> {


    int size();

    boolean isEmpty();

    T get();

    void insert(T e);

    void delete(T e);

    boolean contains(T e);
}
