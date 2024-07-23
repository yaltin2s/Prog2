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

    public static void main(String[] args) {
        Folge<Rechteck>  folge = new FolgeDynArray<> ();
        folge.addLast ( new Rechteck ( 10,20 ) );
        folge.addLast ( new Rechteck ( 10,5 ) );
        folge.addLast ( new Rechteck ( 17,13 ) );
        folge.addLast ( new Rechteck ( 22,12 ) );
        System.out.println ("Folge"+folge);
        System.out.println ("Kleinste Umfang"+ min(folge, new RechteckComparatorNachUmfang ()));
        System.out.println ("Kleinste Fläche"+ min(folge, new RechteckComparatorNachFlaeche ()));
    }
}
