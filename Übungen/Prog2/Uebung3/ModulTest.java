package Uebung3;

import Uebung1.Stud;

class ModulTest {

        public static void main() {
            // Module erstellen
            Modul mathe = new Modul("Mathematik", 5);
            Modul informatik = new Modul("Informatik", 10);
            Modul physik = new Modul("Physik", 8);

            // Studis erstellen
            Stud studi1 = new Stud("Anna",1995);
            Stud studi2 = new Stud("Ben",1998);
            Stud studi3 = new Stud("Clara",2000);

            // Studis zu Modulen anmelden
            studi1.anmelden(mathe);
            studi1.anmelden(informatik);
            studi2.anmelden(mathe);
            studi2.anmelden ( informatik );
            studi3.anmelden(physik);
            studi3.anmelden(informatik);

            // Studis von Modulen abmelden
            studi1.abmelden(informatik);

            // Beleg-Listen der Studis anzeigen
            System.out.println("Belegte Module von Anna: " + studi1.belegt());
            System.out.println("Belegte Module von Ben: " + studi2.belegt());
            System.out.println("Belegte Module von Clara: " + studi3.belegt());

            // Teilnehmerlisten der Module anzeigen
            System.out.println("Teilnehmer in Mathematik: " + mathe.getTeilnehmer ());
            System.out.println("Teilnehmer in Informatik: " + informatik.getTeilnehmer ());
            System.out.println("Teilnehmer in Physik: " + physik.getTeilnehmer ());
        }
    }

