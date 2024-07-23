package Uebung9;

import java.util.Comparator;

public class RechteckComparatorNachUmfang implements Comparator<Rechteck> {

    @Override
    public int compare(Rechteck o1, Rechteck o2) {
        return o1.umfang ()-o2.umfang ();
    }
}
