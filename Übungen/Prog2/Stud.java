public class Stud extends Person{

    private  static int zaeler= 100;
    private final int Matrikelnummer;


    public Stud(String name, int geburtsjahr) {
        super ( name, geburtsjahr );
        this.Matrikelnummer = zaeler++;
    }

    public int getMatrikelnummer() {
        return Matrikelnummer;
    }

    @Override
    public boolean equals( Object object) {
        if (object instanceof Stud) {
            Stud stud = (Stud) object;
            if (this.getMatrikelnummer () == stud.getMatrikelnummer ()) {
                return true;

            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Matrikelnummer: "
                + Matrikelnummer +
                ", Name: "
                + getName();
    }
}
