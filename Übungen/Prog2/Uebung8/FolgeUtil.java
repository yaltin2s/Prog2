package Uebung8;

public   class FolgeUtil{

    public static<T> int frequency( Folge<T> f, T v) {
        int summe = 0;
        for (T element : f) {
            if(element.equals ( v ))
                summe++;

        }
        return summe;
    }

    public static<T> void swap(Folge<T> f, int i,int j){
        T temp = f.get ( i );
        f.set(i, f.get ( j ));
        f.set(j, temp);
    }

    public static <T> void rotate(Folge<T> f, int d) {
        for (int i = 0; i < d; i++) {
            for (int j = f.size() - 1; j > 0; j--) {
                swap(f, j, j - 1);
            }
        }
    }
}
