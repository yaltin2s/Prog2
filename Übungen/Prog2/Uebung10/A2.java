package Uebung10;

public class A2 {

    /* Klassenmethoden */

    public static <T> Folge<Paar<T,T>> erzeugePaare(Folge<? extends T> a, Folge<? extends T> b) {
        if (a.size() != b.size()) throw new IllegalArgumentException("Folgen a und b sind nicht gleich lang.");

        Folge<Paar<T,T>> paare = new FolgeDynArray<>();
        for (int i = 0; i < a.size(); i++) {
            paare.addLast(new Paar<>(a.get(i), b.get(i)));
        }

        return paare;
    }

    public static void main(String[] args) {

        Stud student = new Stud("Jane", 1980);
        Boxer boxer = new Boxer("John", 1984, 80);
        Folge<Stud> a = new FolgeDynArray<>();
        a.addFirst(student);
        Folge<Boxer> b = new FolgeDynArray<>();
        b.addFirst(boxer);
        Folge<Paar<Person,Person>> paare = erzeugePaare(a, b);
        System.out.println(paare);

        Folge<Integer> iFolge = new FolgeDynArray<>();
        iFolge.addFirst(42);
        Folge<String> sFolge = new FolgeDynArray<>();
        sFolge.addFirst("Sinn des Lebens");
        Folge<Paar<Object,Object>> oPaare = erzeugePaare(iFolge, sFolge);
        System.out.println(oPaare);
    }
}
