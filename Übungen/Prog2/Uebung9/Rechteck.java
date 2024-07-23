package Uebung9;

public class Rechteck {

    private int laenge;
    private int breite;

    public Rechteck(int laenge, int breite) {
        this.breite = breite;
        this.laenge = laenge;
    }

    public int umfang() {
        return 2 * (laenge + breite);
    }

    public int flaeche() {
        return laenge * breite;
    }
    @Override
    public String toString() {
        return laenge + "x" + breite + ", Umfang: " + umfang() + ", Fläche: " + flaeche()+ ";;";
    }

}