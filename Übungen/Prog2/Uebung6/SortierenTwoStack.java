package Uebung6;

public class SortierenTwoStack {

    public void Sort (int[] a){
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
    }
}
