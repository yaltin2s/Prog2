package Uebung2;

import Uebung1.Person;

public class Kind extends Person {

    private static  Person person = null;
    private Paare<Person,Person> eltern;

    public Kind(String Name, int gebdatum ) {
        super (Name,gebdatum);
    }
    public Kind(Paare<Person, Person> eltern) {
        this.eltern = eltern;
    }
    public Kind(String name, int geburtsjahr, Person v, Person m) {
        super(name, geburtsjahr);
        setEltern(v, m);
    }

    public void setEltern(Person v, Person m) {
        // Makes sure that equals() works properly with single parents.
        if(v != null && v.equals ( m )) {
            eltern.setErstes(v);
            eltern.setZweites(null);
        }
        eltern.setErstes(v);
        eltern.setZweites(m);
    }
    public void setEltern(Paare<Person,Person> paare) {
       this.eltern = paare;

    }
    public Paare<Person, Person> getEltern() {
        return eltern;
    }

    public static boolean geschwister(Kind a, Kind b){

        if(a.eltern==b.eltern)
            return true;

        return  false;
    }
}
