package Uebung9;

import java.util.Comparator;

public class BubbleSort {

    public static <T> void bubbleSort(T[] a, Comparator<T> c) {
        for (int n = a.length; n > 1; n--)
            for (int i = 0; i < n-1; i++)
                if (c.compare(a[i], a[i+1]) > 0)
                    swap(a, i, i+1);
    }


    public static void main(String[] args) {
        testPersonBubble();
    }

    public static void testPersonBubble() {
        Person d = new Person("Deniz", 1987);
        Person a = new Person("Anna", 2000);
        Person c = new Person("Chris", 2003);
        Person e = new Person("Emil", 1999);
        Person b = new Person("Ben", 2005);
        Person f = new Person("Chris", 2005);
        Person[] p = {d, a, c, e, b, f};
        show(p);
        bubbleSort(p, new PersonComparator());
        show(p);
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
