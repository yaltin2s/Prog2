package Uebung2;

import Uebung1.Person;

public class KindTest {
    public static void main(String[] args) {

        Person Abe = new Person("Abe", 1899);
        Person Mona = new Person("Mona", 1900);
        Person Clancy = new Person("Clancy", 1888);
        Person Jackie = new Person("Jackie", 1920);
        Kind Homer = new Kind ( new Paare<> ( Mona,Abe ));
        Kind Herb = new Kind (new Paare<> ( Abe,null ));
        Kind Marge = new Kind (new Paare<> ( Clancy, Jackie ));
        Kind Selma = new Kind (new Paare<> ( Clancy, Jackie ));
        Kind Patty = new Kind (new Paare<> ( Clancy, Jackie ));
        Kind Bart = new Kind (new Paare<> ( Homer,Marge ));
        Kind Lisa = new Kind (new Paare<> ( Homer,Marge ));
        Kind Maggie = new Kind (new Paare<> ( Homer,Marge ));
        System.out.println ( Kind.geschwister ( Bart,Maggie ));

    }
}
