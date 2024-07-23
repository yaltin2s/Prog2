package Uebung10;

import java.util.Iterator;

public class Bibliothek <T extends Buch> implements Iterable<T> {

    private Menge<Buch> buecher;

    public Bibliothek() {
        this.buecher = new MengeEVL<> ();
    }

    public void addBuch(T buch){
        buecher.insert ( buch );
    }

    @Override
    public Iterator<T> iterator() {
        //noinspection unchecked
        return (Iterator<T>) buecher.iterator();
    }
}
