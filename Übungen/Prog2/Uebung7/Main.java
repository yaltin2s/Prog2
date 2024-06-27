package Uebung7;

public class Main {


    public static void main(String[] args) {

        Temperatursensor ts = new Temperatursensor();
        for (int i = 0; i < 36; i++)
            ts.neueMessung ( i );
        System.out.println(ts.aktuelleTemperatur() + "/" + ts.durchschnittsTemperatur());
        ts.reset();
        System.out.println(ts.aktuelleTemperatur() + "/" + ts.durchschnittsTemperatur());
    }
}