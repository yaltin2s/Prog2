package Uebung8;

import java.time.Duration;

public class Song {
    private String titel;
    private String interpret;
    private Duration laenge;
    private int erscheinungjahr;
    private String songtext;

    public Song(String titel, String interpret, Duration laenge, int erscheinungjahr) {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
        this.erscheinungjahr = erscheinungjahr;
    }

    public String getTitel() {
        return titel;
    }

    public String getInterpret() {
        return interpret;
    }

    public Duration getLaenge() {
        return laenge;
    }

    public int getErscheinungjahr() {
        return erscheinungjahr;
    }

    public String getSongtext() {
        return songtext;
    }

    public void setSongtext(String songtext) {
        this.songtext = songtext;
    }
    @Override
    public String toString() {
        return interpret + ", " + titel + ", " + laenge;
    }
}
