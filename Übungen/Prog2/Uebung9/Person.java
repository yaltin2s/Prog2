package Uebung9;

public class Person {
    private String name;
    private int geburtsjahr;

    /* Konstruktoren */

    public Person(String name, int geburtsjahr) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }

    /* Instanzmethoden */

    public String name() {
        return name;
    }

    public int gebJahr() {
        return geburtsjahr;
    }

    @Override
    public String toString() {
        return name + " (" + geburtsjahr + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person && name.equals(((Person) obj).name) && geburtsjahr == ((Person) obj).geburtsjahr;
    }
}
