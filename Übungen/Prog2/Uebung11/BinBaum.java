package Uebung11;

import java.util.Iterator;


public class BinBaum <T> implements Iterable<T>{

    protected Knoten root;

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public class Knoten{
        public Knoten left;
        public T value;
        public Knoten right;

        public Knoten (T value){
            this(null,value,null);
        }
        public Knoten(Knoten left, T value, Knoten right) {
            this.left = left;
            this.value = value;
            this.right = right;
        }

        @Override
        public String toString() {
            return "" + value;
        }

    }

    private class BfsIterator implements Iterator<T> {

        /* Instanzvariable */

        private Schlange<Knoten> queue;

        /* Konstruktoren */

//        private BfsIterator() {
//            queue = new SchlangeDynArray<>();
//            if (!isEmpty()) queue.enqueue(root);
//        }


        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public T next() {
            Knoten k = queue.front();
            if (k.left != null) queue.enqueue(k.left);
            if (k.right != null) queue.enqueue(k.right);
            queue.dequeue();
            return k.value;
        }
    }
}
