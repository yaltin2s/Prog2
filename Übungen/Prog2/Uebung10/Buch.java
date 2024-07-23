package Uebung10;

public class Buch implements Comparable<Buch> {

    private String titel;
    private Autor autor;

    public Buch(String titel, Autor autor){
        this.autor = autor;
        this.titel = titel;
    }

    @Override
    public String toString(){
        return "/"+titel+"/"+"von"+ autor;
    }

    @Override
    public int compareTo(Buch o) {
        return this.titel.equals(o.titel) ? this.autor.compareTo(o.autor) : this.titel.compareTo(o.titel);
    }
}
