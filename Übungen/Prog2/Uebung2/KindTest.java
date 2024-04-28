package Uebung2;

import Uebung1.Person;

import static Uebung2.Kind.geschwister;

public class KindTest {
    public static void main(String[] args) {

        Person Abe = new Person("Abe", 1899);
        Person Mona = new Person("Mona", 1900);
        Person Clancy = new Person("Clancy", 1888);
        Person Jackie = new Person("Jackie", 1920);
        Kind Herb = new Kind  ( "Herb", 1920 );
        Kind Homer = new Kind ( "Homer", 1930 );
        Kind Marge = new Kind ( "Marge", 1940 );
        Kind Selma = new Kind ( "Selma", 1943 );
        Kind Patty = new Kind ( "Patty", 1945 );
        Kind Bart = new Kind  ( "Bart", 1962 );
        Kind Lisa = new Kind  ( "Lisa", 1964 );
        Kind Maggie= new Kind ( "Maggie", 1965 );
        //Herb.setEltern ( Abe, null );
        Homer.setEltern ( new Paare<> ( Abe,Mona ) );
        Herb.setEltern ( new Paare<> ( Abe,null ) );
        Marge.setEltern ( new Paare<> ( Clancy,Jackie ) );
        Selma.setEltern ( new Paare<> ( Clancy,Jackie ) );
        Patty.setEltern ( new Paare<> ( Clancy,Jackie ) );
        Bart.setEltern ( new Paare<> ( Homer,Marge ) );
        Lisa.setEltern ( new Paare<> ( Homer,Marge ) );
        Maggie.setEltern ( new Paare<> ( Homer,Marge ) );

        System.out.println (geschwister(Bart,Lisa));
        System.out.println (Bart.getEltern ());
    }
}
