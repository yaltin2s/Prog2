package Uebung9;
import Uebung1.Person;

import java.util.Comparator;

public class AlterComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getGeburtsjahr () - o2.getGeburtsjahr ();
    }
}
