package Uebung3;


import java.util.Iterator;

public class DynArray<T> implements Iterable<T>{
    private static final int startGroesse = 2; // Länge des Arrays (initial)

    private T[] array;
    private int size; // Anzahl der "belegten" Plätze



    @SuppressWarnings("unchecked")
    public DynArray() {
        array =  (T[]) new Object[startGroesse];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int pos, T e) throws IndexOutOfBoundsException {
        // Ändern von bereits belegten Positionen
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();
        array[pos]= e;
    }

    public T get(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();
        return array[pos];
    }

    public T getLast(){
        return array[size-1];
    }

    @SuppressWarnings("DataFlowIssue")
    public void add(T e) {
        // hinzufügen neuer Elemente
//        int i = size;
//        while (i < 0) {
//            array[i + 1] = array[i];
//            i--;
//        }
//        array[0] = e;
        if(size >= array.length)
            increase();
        array[size++] = e;
    }

    public String toString() {
        StringBuilder s = new StringBuilder ();
        for (int i = 0; i < size; i++)
            s.append ( array[i] ).append ( "\t" );
        return s.toString ();
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        // Verlängerung des Arrays bei Bedarf
        T[] neu = (T[]) new Object[array.length*2];
        if (size >= 0) System.arraycopy ( array, 0, neu, 0, size );
        array = neu;
    }


    // nur für Testzwecke
    protected void show() {
        System.out.println("size\t length\t Array-Inhalt");
        System.out.print(size + "\t" + array.length + "\t");
        for (T t : array) System.out.print ( t + "\t" );
        System.out.println();
    }

    // Aufgabe 3.2 (a)

    public void remove(int pos) {
        if (pos >= 0 && pos < size) {
            for (int i = pos; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
        }
    }

    public void removeLast(){
        this.remove (size-1);
    }

    //Aufgabe 3.2 (b)
    private void remove() {
        remove(0);
    }

    // c) void delete(T e)
    public void delete(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                remove(i);
                break;
            }
        }
    }

    // d) boolean contains(T e)
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            T element = array[i];
            if (e == null && element == null) {
                return true;
            }
            if (element != null && element.equals(e)) {
                return true;
            }
        }
        return false;
    }


    // e) void decrease()
    @SuppressWarnings("unchecked")
    private void decrease() {
        if (size <= array.length / 4) {
            int newCapacity = Math.max ( size, array.length / 2 );
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy ( array, 0, newArray, 0, size );
            array = newArray;
        }

    }



    private class DynArrayIterator implements Iterator<T> {

        /* Instanzvariablen */

        int i;

        /* Konstruktoren */

        DynArrayIterator() {
            i = 0;
        }

        /* Instanzmethoden */

        @Override
        public boolean hasNext() {
            return i < size;
        }

        @Override
        public T next() {
            return array[i++];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new DynArrayIterator();  // Innere Klasse: Elementklasse
    }
}