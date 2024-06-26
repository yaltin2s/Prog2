package Uebung6;

import java.util.Arrays;

public class SortierenTwoStack {

    public static void sort(int[] a){
        Stapel<Integer> up = new StapelEVL<> ();
        Stapel<Integer> down = new StapelEVL<> ();

        for(int i : a){
            if(up.isEmpty () && down.isEmpty ()){
                up.push(i);
            } else if (i < up.top () ) {
                while (!up.isEmpty () && i < up.top ()) {
                    down.push ( up.top () );
                    up.pop ();
                }
                up.push ( i );
            } else if (i> down.top ()) {
                while (!down.isEmpty () && i > down.top ()) {
                    up.push ( down.top () );
                    down.pop ();
                }
                down.push ( i );
            }else {
                up.push( i );
            }
        }
        while (!up.isEmpty()) {
            down.push(up.top());
            up.pop();
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = down.top();
            down.pop();
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        System.out.println("Vorher:  " + Arrays.toString(arr));
        sort (arr);
        System.out.println("Nachher: " + Arrays.toString(arr));
    }
}