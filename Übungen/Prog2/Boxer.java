public class Boxer extends Person {

    private double Gewicht ;

    public Boxer(String name, int geburtsjahr, double gewicht ) {
        super ( name, geburtsjahr );
        this.Gewicht = gewicht;
    }

    public double getGewicht() {
        return Gewicht;
    }

    public void setGewicht(double gewicht) {
        Gewicht = gewicht;
    }
}
