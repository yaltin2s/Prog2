package Uebung10;

public class A10_1 {

    public static void ausgeben(Bibliothek<?> bib){
        for(Buch buch : bib){
            System.out.println (buch);
        }
    }

    public static void addBuch(Bibliothek<? super Buch> bib, Menge<? extends Buch> buecher) {
        for(Buch buch : buecher )
            bib.addBuch ( buch );
    }
    /* Hinweis: Da die Bibliothek bereits <T extends Buch> hat,
           bringt das <? super Buch> hier keinen Mehrwert,
           da T dann konkret nur noch vom Typ T sein kann.
           Es genügt also <Buch> statt <? super Buch> zu schreiben. */


    /* Hinweis: Da die Bibliothek bereits <T extends Buch> hat,
           reicht es eigentlich hier nur <?> statt <? extends Buch> zu schreiben*/
    public static Folge<Buch> sortieren(Bibliothek<? extends Buch> bib){
        Folge<Buch> folge = new FolgeDynArray<> ();

        for(Buch buch : bib) {
            if (folge.isEmpty ()) {
                folge.addFirst ( buch );
            } else {
                int i=0;
                while(i< folge.size ()&& buch.compareTo ( folge.get ( i ) )>0){
                    i++;
                }
                folge.insert ( i,buch );
            }
        }
        return folge;
    }

    public static void main(String[] args) {
        Buch b1 = new Buch("Java ist auch eine Insel", new Autor("Christian Ullenboom"));
        Buch b2 = new Buch("Grundkurs Programmieren in Java", new Autor("Dietmar Ratz & Dennis Schulmeister-Zimolong & Detlef Seese & Jan Wiesenberger"));
        Buch b3 = new Buch("Java als erste Programmiersprache", new Autor("Joachim Goll"));
        Buch b4 = new Buch("Java als erste Programmiersprache", new Autor("Cornelia Heinisch"));


        Bibliothek<Buch> bib = new Bibliothek<> ();
        bib.addBuch ( b1 );
        bib.addBuch ( b2 );
        bib.addBuch ( b3 );
        bib.addBuch ( b4 );
        ausgeben ( bib );
        System.out.println ("_______________________________________");
        Folge<Buch> folge = sortieren ( bib );
        for (Buch b: folge){
            System.out.println (b);
        }
    }
}
