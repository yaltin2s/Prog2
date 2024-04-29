package Uebung3;

import Uebung1.Stud;

public class Modul {

    private String bezeichnung;
    private int  Ects;
    private DynArray<Stud> teilnehmer = new DynArray<Stud>();


    public Modul(String bezeichnung,int Ects){
        this.bezeichnung=bezeichnung;
        this.Ects=Ects;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", Ects=" + Ects +
                '}';
    }

    public DynArray<Stud> getTeilnehmer(){
        return teilnehmer;
    }

    public void addTeilnehmer(Stud S) {
        teilnehmer.add ( S );
    }

    public int getStudentsanzahl(){
        return teilnehmer.size ();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getEcts() {
        return Ects;
    }
}
