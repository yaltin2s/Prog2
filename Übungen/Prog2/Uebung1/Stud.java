package Uebung1;

import Uebung3.DynArray;
import Uebung3.MengeDynArray;
import Uebung3.Modul;

public class Stud extends Person{

    private  static int zaeler= 100;
    private final int Matrikelnummer;
    private DynArray<Modul> belegteModule;


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

    public void anmelden(Modul m){
        belegteModule.add(m);
        m.anmelden(this);

    }

    public DynArray<Modul> belegt() {
        return belegteModule;
    }

    public void abmelden(Modul m) {
        belegteModule.delete (m);
        m.abmelden(this);
    }

    @Override
    public String toString() {
        return "Matrikelnummer: "
                + Matrikelnummer +
                ", Name: "
                + getName();
    }
}
