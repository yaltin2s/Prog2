package Uebung7;

import java.util.NoSuchElementException;

public class Temperatursensor {

    private Ringpuffer<Float> temp;

    public Temperatursensor() {
        reset();
    }
    void reset (){
        temp= new RingpufferLIFO<> (24);
    }
    void neueMessung(float wert){
        temp.add ( wert );
    }

    public float aktuelleTemperatur  () {
        try {
            return temp.get();
        } catch (NoSuchElementException e) {
            return Float.NaN;
        }
    }
    public float durchschnittsTemperatur (){
        if(temp.isEmpty ()) return Float.NaN;
        float avg=0;
        for(float e: temp){
            avg+=e;
        }
        return avg/temp.size ();
    }

}
