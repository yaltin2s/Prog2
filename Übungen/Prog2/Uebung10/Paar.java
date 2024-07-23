package Uebung10;

public class Paar<E, Z> {

    /* Instanzvariablen */

    private E erstes;
    private Z zweites;

    /* Konstruktoren */

    public Paar(E erstes, Z zweites) {
        this.erstes = erstes;
        this.zweites = zweites;
    }

    /* Instanzmethoden */

    public E getErstes() {
        return erstes;
    }

    public Z getZweites() {
        return zweites;
    }

    public void setErstes(E erstes) {
        this.erstes = erstes;
    }

    public void setZweites(Z zweites) {
        this.zweites = zweites;
    }

    @Override
    public String toString() {
        return erstes + " " + zweites;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Paar<?, ?>)) return false;
        Paar<E, Z> p = (Paar<E, Z>) obj;
        return erstes.equals(p.erstes) && zweites.equals(p.zweites);
    }
}
