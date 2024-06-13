package Uebung6;

public interface Stapel <T> extends Iterable<T>{
    /**
     * Liefert die Anzahl der gespeicherten Elemente.
     */
    int size();

    /**
     * Prüft, ob der Stapel kein Element enthält.
     */
    boolean isEmpty();

    /**
     * Liefert das zuletzt eingefügte Element des Stapels.
     * Erzeugt eine NoSuchElementException, falls der Stapel leer ist.
     */
    T top();

    /**
     * Fügt ein Element dem Stapel hinzu.
     */
    void push(T e);

    /**
     * Entfernt das oberste Element vom Stapel.
     * Hat keine Wirkung, falls der Stapel leer ist.
     */
    void pop();
}
