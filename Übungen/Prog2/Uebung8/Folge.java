package Uebung8;
import java.util.NoSuchElementException;

public interface Folge <T> extends Iterable<T>{
    int size();
    boolean isEmpty();
    boolean contains( T e);
    T get(int pos) throws IndexOutOfBoundsException;
    void set(int pos, T e) throws IndexOutOfBoundsException;
    int pos(T e) throws NoSuchElementException;
    void insert (int pos, T e) throws IndexOutOfBoundsException;
    void addFirst(T e);
    void addLast( T e);
    void remove(int pos) throws IndexOutOfBoundsException;
    void delete(T e) throws IndexOutOfBoundsException;
}