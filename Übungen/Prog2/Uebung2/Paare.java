package Uebung2;

import java.util.Objects;

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

    public boolean equals(Object o){
        if(! (o instanceof Paare<?, ?> p))
            return false;
        if (!Objects.equals ( erstes, p.erstes )) return false;
        if (!Objects.equals( zweites, p.zweites )) return false;

        return true;
        }
    }
