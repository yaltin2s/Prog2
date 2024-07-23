package Uebung10;

public class Boxer extends Person {

    /* Instanzvariablen */

    private double gewicht;

    /* Konstruktoren */

    public Boxer(String name, int geburtsjahr, double gewicht) {
        super(name, geburtsjahr);
        this.gewicht = gewicht;
    }

    /* Instanzmethoden */

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return super.toString() + " " + gewicht + "kg";
    }
}
