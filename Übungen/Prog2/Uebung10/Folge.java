package Uebung10;

import java.util.NoSuchElementException;

public interface Folge<T> extends Iterable<T> {

    /**
     * Liefert die Anzahl der Elemente.
     * @return
     */
    int size();

    /**
     * Prüft, ob die Folge leer ist.
     */
    boolean isEmpty();

    /**
     * Prüft, ob es ein Element mit Eintrag e in der Folge gibt.
     */
    boolean contains(T e);

    /**
     * Liefert das Element an der i-ten Position.
     * @throws IndexOutOfBoundsException
     */
    T get(int pos) throws IndexOutOfBoundsException;

    /**
     * Ändert das Element an der i-ten Position.
     * @throws IndexOutOfBoundsException
     */
    void set(int pos, T e) throws IndexOutOfBoundsException;

    /**
     * Liefert die Position (des ersten Vorkommens) von Eintrag e löst eine NoSuchElementException aus, falls e nicht in der Folge vorkommt.
     * @throws NoSuchElementException
     */
    int pos(T e) throws NoSuchElementException;

    /**
     * Fügt ein neues Element an Position i ein.
     * Alle folgenden Elemente verschieben sich um eine Position nach hinten.
     * @throws IndexOutOfBoundsException
     */
    void insert(int pos, T e) throws IndexOutOfBoundsException;

    /**
     * Fügt ein neues Element vorne in die Folge ein.
     * Alle nachfolgenden Elemente verschieben sich um eine Position nach hinten.
     */
    void addFirst(T e);

    /**
     * Hängt ein neues Element an die Folge an.
     */
    void addLast(T e);

    /**
     * Entfernt das (erste Vorkommen von) Element e aus der Folge.
     * Alle nachfolgenden Elemente verschieben sich um eine Position nach vorne.
     * Die Methode macht nichts, falls e nicht in der Folge vorkommt.
     */
    void delete(T e);

    /**
     * Entfernt das Element an Position i aus der Folge.
     * Alle nachfolgenden Elemente verschieben sich um eine Position nach vorne.
     * @throws IndexOutOfBoundsException
     */
    void remove(int pos) throws IndexOutOfBoundsException;
}
