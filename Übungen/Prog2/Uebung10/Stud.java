package Uebung10;

public class Stud extends Person {

    /* Klassenvariablen */

    private static int zaehler = 100;

    /* Instanzvariablen */

    private final int matrikelnr;

    /* Konstruktoren */

    public Stud(String name, int geburtsjahr) {
        super(name, geburtsjahr);
        matrikelnr = zaehler++;
    }

    /* Instanzmethoden */

    public int getMatrikelnr() {
        return matrikelnr;
    }

    @Override
    public String toString() {
        return matrikelnr + " " + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Stud && matrikelnr == ((Stud) obj).matrikelnr;
    }
}
