package Uebung6;

import Uebung2.Paare;
import Uebung3.DynArray;

public class Klammerstruktur {

    public static boolean check(String[] satz) {
        DynArray<Paare<String, String>> paareDynArray = new DynArray<> ();
        // Add the different pairs to the DynArray**************************************
        paareDynArray.add ( new Paare<> ( "(", ")" ) );
        paareDynArray.add ( new Paare<> ( "{", "}" ) );
        paareDynArray.add ( new Paare<> ( "[", "]" ) );
        paareDynArray.add ( new Paare<> ( "begin", "end" ) );
        paareDynArray.add ( new Paare<> ( "start", "stop" ) );
        //Stack Definition ***********************************

        Stapel<String> stack = new StapelEVL<> ();

        for (String word : satz) {
            for (Paare<String, String> pair : paareDynArray) {
                if (pair.getErstes ().equals ( word )) {
                    stack.push ( word );
                    break;
                } else if (pair.getZweites ().contains ( word )) {
                    if (stack.isEmpty () || !pair.getErstes ().equals ( stack.top () )) return false;
                    stack.pop ();
                    break;
                }

            }
        }
        return stack.isEmpty ();
    }

    private static void test(String satz) {
        System.out.println(check (satz.split ( " " )));
    }

    public static void main(String[] args) {
        test ( "(String)" );
        test ( "(jhdmhsds start mjmhfdh stop fsdfdfd)" );
        test ( "( a + b ) * a − b ) ist nicht korrekt" );
    }
}