package Uebung10;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EVL<T> implements Iterable<T> {

    private ListenElem first;
    private ListenElem last;
    private int size;

    // innere Klasse
    class ListenElem {
        T value;
        ListenElem next;

        ListenElem (T v) {
            value = v;
            next = null;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public T getFirst() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Liste leer");

        return first.value;
    }

    public  T getLast() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Liste leer");

        return last.value;
    }

    public void insert(T v) {
        ListenElem neu = new ListenElem(v);
        if (isEmpty()) last = neu;
        neu.next = first;
        first = neu;
        size++;
    }

    public void append(T v) {
        ListenElem neu = new ListenElem(v);
        if (isEmpty()) {
            first = last = neu;
            size++;
            return;
        }
        last.next = neu;
        last = neu;
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) return;

        first = first.next;
        size--;
        if (isEmpty()) last = null;
    }

    public void removeLast() {
        if (isEmpty()) return;
        if (size() == 1) {
            removeFirst();
            return;
        }

        ListenElem elem = first;
        while (elem.next != last) {
            elem = elem.next;
        }
        elem.next = null;
        last = elem;
        size--;
    }

    public void delete(T v) {
        if (isEmpty() || !contains(v)) return;

        if (first.value.equals(v)) {
            removeFirst();
            return;
        }
        if (last.value.equals(v)) {
            removeLast();
            return;
        }

        ListenElem elem = first;
        while (elem.next != null && !elem.next.value.equals(v)) {
            elem = elem.next;
        }
        elem.next = elem.next.next;
        size--;
    }

    public boolean contains(T v) {
        ListenElem e = first;

        // suche Element e mit Eintrag v
        while(e != null && !e.value.equals(v)) {
            e = e.next;
        }
        return (e != null);
    }

    @Override
    public String toString() {
        String s = "";
        ListenElem tmp = first;
        while (tmp!= null) {
            s += tmp.value + " ";
            tmp = tmp.next;
        }
        return s;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {	// Innere Klasse: Anonyme Klasse

            /* Instanzvariablen */

            ListenElem cursor = first;

            /* Instanzmethoden */

            @Override
            public boolean hasNext() {
                return cursor != null;
            }

            @Override
            public T next() {
                T value = cursor.value;
                cursor = cursor.next;
                return value;
            }
        };
    }
}