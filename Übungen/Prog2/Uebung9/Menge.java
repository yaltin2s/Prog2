package Uebung9;

public interface Menge<T> extends Iterable<T> {

    /**
     * Liefert die Anzahl der gespeicherten Elemente.
     */
    int size();

    /**
     * Prüft, ob die Menge leer ist.
     */
    boolean isEmpty();

    /**
     * Liefert irgendein Element der Menge.
     * Erzeugt eine NoSuchElementException, falls es nicht enthalten ist.
     */
    T get();

    /**
     * Fügt ein Element der Menge hinzu.
     */
    void insert(T e);

    /**
     * Entfernt Element e aus der Menge.
     * Erzeugt eine NoSuchElementException, falls es nicht enthalten ist.
     */
    void delete(T e);

    /**
     * Prüft, ob Element e in der Menge enthalten ist.
     */
    boolean contains(T e);
}
