package Uebung10;

public class Box<T> {
    private T inhalt;
    public T getInhalt() { return inhalt; }
    public void setInhalt(T inhalt) { this.inhalt = inhalt; }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setInhalt(123);
        Box<?> rawBox = intBox; // Nutzung des Raw Types (Object) wird mit <?> vermieden.
        //rawBox.setInhalt("Hallo"); // Ein unbekannter Typ kann nicht geschrieben werden.
        Integer intValue = (Integer) rawBox.getInhalt(); // Castfehler zur Laufzeit
        System.out.println(intValue);
    }
}
