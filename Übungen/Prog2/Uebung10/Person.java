package Uebung10;

public abstract class Person {

    /* Instanzvariablen */

    private final String name;
    private final int geburtsjahr;

    /* Konstruktoren */

    public Person(String name, int geburtsjahr) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }

    /* Instanzmethoden */

    public String getName() {
        return name;
    }

    public int getGeburtsjahr() {
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
