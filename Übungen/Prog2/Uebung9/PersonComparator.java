package Uebung9;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name().equals(o2.name()) ? o2.gebJahr() - o1.gebJahr() : o1.name().compareTo(o2.name());
    }
}