package Uebung10;

public class Autor implements Comparable<Autor>{

    private String name;


    public Autor(String name){
        this.name= name;
    }

    @Override
    public String toString(){
        return  name;
    }


    @Override
    public int compareTo(Autor o) {
        return this.name.compareTo ( o.name);
    }
}
