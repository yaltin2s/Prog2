package Uebung9;

import Uebung8.Folge;
import Uebung8.FolgeDynArray;

import java.util.Comparator;

public class RechteckUtil {

    public static Rechteck min(Folge<Rechteck> folge, Comparator<Rechteck> comparator){

        Rechteck min = null;
        for(Rechteck r : folge) {
            if (min == null || comparator.compare ( r, min ) < 0) {
                min = r;
            }
        }
        return min;
    }

    public static Rechteck max(Folge<Rechteck> folge, Comparator<Rechteck> comparator){

        Rechteck min = null;
        for(Rechteck r : folge) {
            if (min == null || comparator.compare ( r, min ) > 0) {
                min = r;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Folge<Rechteck>  folge = new FolgeDynArray<> ();
        folge.addLast ( new Rechteck ( 9,11 ) );
        folge.addLast ( new Rechteck ( 10,5 ) );
        folge.addLast ( new Rechteck ( 5,4 ) );
        folge.addLast ( new Rechteck ( 13,7 ) );
        System.out.println ("Folge\n"+folge);
        System.out.println ("Kleinste Umfang \t"+ min(folge, new RechteckComparatorNachUmfang ()));
        System.out.println ("Kleinste Fläche \t"+ min(folge, new RechteckComparatorNachFlaeche ()));
        System.out.println ("Größester Umfang \t"+ max(folge, new RechteckComparatorNachUmfang ()));
        System.out.println ("Größester Fläche \t"+ max(folge, new RechteckComparatorNachFlaeche ()));
    }
}
