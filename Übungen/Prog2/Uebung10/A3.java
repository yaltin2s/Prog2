package Uebung10;

public class A3 {
    public static class Box<T> {
        private T inhalt;
        public T getInhalt() { return inhalt; }
        public void setInhalt(T inhalt) { this.inhalt = inhalt; }

        public static void main(String[] args) {
            Box<Integer> intBox = new Box<>();
            intBox.setInhalt(123);
            Box<?> wildcardBox = intBox;
            // wildcardBox.setInhalt("Hallo"); // Diese Zeile verursacht einen Kompilierungsfehler
            Integer intValue = (Integer) wildcardBox.getInhalt();
            System.out.println(intValue);
        }
    }

}
