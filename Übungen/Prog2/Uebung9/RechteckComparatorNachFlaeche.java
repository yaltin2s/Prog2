package Uebung9;

import java.util.Comparator;

public class RechteckComparatorNachFlaeche implements Comparator<Rechteck> {


    @Override
    public int compare(Rechteck o1, Rechteck o2) {
        return o1.flaeche ()- o2.flaeche ();
    }
}
