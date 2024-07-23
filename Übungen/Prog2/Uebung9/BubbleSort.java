package Uebung9;
import Uebung1.Person;

import java.util.Comparator;

public class BubbleSort {

    // mit innerer Ordnung (Integer implements Comparable<Integer>)
    public static void bubbleSort(Integer[] a) {
        for (int n = a.length; n > 1; n--)
            for (int i = 0; i < n-1; i++)
                //if (a[i] > a[i+1])
                if (a[i].compareTo(a[i+1]) > 0)
                    swap(a, i, i+1);
    }

    // mit aeusserer Ordnung
    public static <T> void bubbleSort(T[] a, Comparator<T> c) {
        for (int n = a.length; n > 1; n--)
            for (int i = 0; i < n-1; i++)
                if (c.compare(a[i], a[i+1]) > 0)
                    swap(a, i, i+1);
    }


    public static void main(String[] args) {
        testIntBubble();
        System.out.println();
        testPersonBubble();
    }

    public static void testIntBubble() {
        Integer[] a = { 15, 33, 42, 17, 47, 11 };
        show(a);
        bubbleSort(a);
        show(a);
    }

    public static void testPersonBubble() {
        Person d = new Person("Deniz", 1987);
        Person a = new Person("Anna", 2000);
        Person c = new Person("Chris", 2003);
        Person e = new Person("Emil", 1999);
        Person b = new Person("Ben", 2005);
        Person[] p = {d, a, c, e, b};
        show(p);
        bubbleSort(p, new NameComparator());
        show(p);
        bubbleSort(p, new AlterComparator());
        show(p);
    }


    private static void show(Integer[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void show(Person[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    private static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}