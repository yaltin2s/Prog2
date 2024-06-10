package Uebung4;

public class MengeEVL<T> implements Menge<T>{

    private EVL<T> list;

    public MengeEVL(){
        list = new EVL<> ();
    }
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public T get() {
        return list.getFirst();
    }

    @Override
    public void insert(T e) {
        if (contains(e)) return;

        list.insert(e);
    }

    @Override
    public void delete(T e) {
        list.delete(e);
    }

    @Override
    public boolean contains(T e) {
        return list.contains(e);
    }
}
