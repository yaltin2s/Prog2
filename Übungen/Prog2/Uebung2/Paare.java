package Uebung2;

public class Paare <E,Z>{

    private E erstes;
    private Z zweites;

    public Paare(E erstes, Z zweites) {
        this.erstes = erstes;
        this.zweites = zweites;
    }

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
        return "Paare{" +
                "erstes=" + erstes +
                ", zweites=" + zweites +
                '}';
    }
}
