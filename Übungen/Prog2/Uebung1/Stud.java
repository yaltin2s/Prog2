package Uebung1;

import Uebung3.Modul;

public class Stud extends Person{

    private  static int zaeler= 100;
    private final int Matrikelnummer;


    public Stud(String name, int geburtsjahr) {
        super ( name, geburtsjahr );
        this.Matrikelnummer = zaeler++;
    }

    public int getMatrikelnummer() {
        return Matrikelnummer;
    }

    @Override
    public boolean equals( Object object) {
        if (object instanceof Stud stud) {
            return this.getMatrikelnummer () == stud.getMatrikelnummer ();
        }
        return false;
    }

    public void anmelden(Modul M){


    }

    @Override
    public String toString() {
        return "Matrikelnummer: "
                + Matrikelnummer +
                ", Name: "
                + getName();
    }
}
