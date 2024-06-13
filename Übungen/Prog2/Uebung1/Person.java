package Uebung1;

public class Person {


    private  String Name;
    private  int Geburtsjahr;


    //Konstrukteur
    public Person(String name, int geburtsjahr) {
        this.Name = name;
        this.Geburtsjahr = geburtsjahr;
    }

    public Person(Person person) {
        Name = person.Name;
        Geburtsjahr = person.Geburtsjahr;
    }

    public Person() {
    }
    public Person(String name) {
        this.Name = name;
    }

    public int getGeburtsjahr() {
        return Geburtsjahr;
    }

    public String getName() {
        return Name;
    }

    @Override
    public boolean equals (Object object){
        //if(this == object) return true;
       // if (object ==null||getClass ()!=object.getClass ()) return  false;
        if(object instanceof Person person){
            return Geburtsjahr == person.Geburtsjahr && object.equals ( Name );
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" +
                "Name='" + Name  +
                ')';
    }
}
