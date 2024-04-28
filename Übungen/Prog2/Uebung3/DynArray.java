package Uebung3;


public class DynArray<T> {
    private static int startGroesse = 2; // Länge des Arrays (initial)

    private T[] array;
    private int size; // Anzahl der "belegten" Plätze
    private int capacity;


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

    public void add(T e) {
        // hinzufügen neuer Elemente
        if(size >= array.length)
            increase();
        array[size++] = e;
    }

    public String toString() {
        String  s = "";
        for (int i = 0; i < size; i++)
            s = s + array[i] + "\t";
        return s;
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        // Verlängerung des Arrays bei Bedarf
        T[] neu = (T[]) new Object[array.length*2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
    }


    // nur für Testzwecke
    protected void show() {
        System.out.println("size\t length\t Array-Inhalt");
        System.out.print(size + "\t" + array.length + "\t");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
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

    //Aufgabe 3.2 (b)
    public void remove() {
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
        for (T element : array) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    // e) void decrease()
    @SuppressWarnings("unchecked")
    private void decrease() {
        if (size <= array.length / 4) {
            int newCapacity = Math.max ( capacity, array.length / 2 );
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy ( array, 0, newArray, 0, size );
            array = newArray;
        }

    }
}