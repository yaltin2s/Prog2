public abstract class Person {


    private final String Name;
    private final int Geburtsjahr;


    //Konstrukteur
    public Person(String name, int geburtsjahr) {
        this.Name = name;
        this.Geburtsjahr = geburtsjahr;
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
        if(object instanceof Person){
        Person person = (Person) object;
            return Geburtsjahr == person.Geburtsjahr && object.equals ( Name );        }
        return false;
    }

    @Override
    public String toString() {
        return "(" +
                "Name='" + Name + "  " +
                ", Geburtsjahr=" + Geburtsjahr +
                ')';
    }
}
