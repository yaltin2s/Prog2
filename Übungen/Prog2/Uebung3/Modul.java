package Uebung3;

import Uebung1.Stud;

public class Modul {

    private final String bezeichnung;
    private final int  Ects;
    private  DynArray<Stud> teilnehmer;


    public Modul(String bezeichnung,int Ects){
        this.bezeichnung=bezeichnung;
        this.Ects=Ects;
        teilnehmer = new DynArray<Stud>();
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

    public int getStudentsAnzahl(){
        return teilnehmer.size ();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getEcts() {
        return Ects;
    }

    // Methoden zum Anmelden und Abmelden von Studis
    public void anmelden(Stud studi) {
        if (!teilnehmer.contains(studi)) {
            teilnehmer.add(studi);
        }
    }

    public void abmelden(Stud studi) {
        teilnehmer.delete (studi);
    }
}
