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

    public void setEltern(Paare<Person, Person> eltern) {
        this.eltern = eltern;
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
