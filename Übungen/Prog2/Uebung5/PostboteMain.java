package Uebung5;

import Uebung1.Person;

public class PostboteMain {

    public static void main(String[] args) {

        Person[] people;

        people = new Person[] {null,
                new Person("Anna"),
                new Person("Ben"),
                new Person("Chris"),
                new Person("Didi")
        };
        print(people);

        people = new Person[] {null,
                new Person("Anna"),
                new Person("Ben"),
                new Person("Chris")
        };
        print(people);

        people = new Person[] {null,
                new Person("Anna")
        };
        print(people);
    }
String s ="";
    public static <T> void print(T[] array) {
        Postbote<T> p = new Postbote (array);
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        System.out.println();
    }
}
