package Uebung7;

public interface Schlange<T> extends Iterable<T> {
    int size();

    /**
     * Prüft, ob die Schlange kein Element enthält.
     */
    boolean isEmpty();

    /**
     * Liefert das "vorderste" Element der Schlange.
     * Erzeugt eine NoSuchElementException, falls die Schlange leer ist.
     */
    T front();

    /**
     * Fügt ein neues Element in die Schlange ein.
     */
    void enqueue(T e);

    /**
     * Entfernt das vorderste Element der Schlange.
     * Hat keine Wirkung, falls die Schlange leer ist.
     */
    void dequeue();
}
