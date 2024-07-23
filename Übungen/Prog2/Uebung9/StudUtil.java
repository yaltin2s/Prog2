package Uebung9;

;

public class StudUtil {

    public static Stud[] sort (Menge<Stud> m){
        Stud[] studs = new Stud[m.size ()];
        Stud s = m.get ();
        m.delete ( s );
        studs[0] = s;
        int cursor = 0;
        while(!m.isEmpty ()){
            s=  m.get ();
            m.delete ( s );
            studs[cursor+1]= s;
            for(int i = cursor++; i>=0;i--){
                Stud a = studs[i];
                if(s.compareTo ( a )<0){
                    studs[i+1]= a;
                    studs[i]= s;
                }else break;
            }
        }

        return  studs;
    }

    public static void main(String[] args) {
        Stud a = new Stud("Anna");
        Stud b = new Stud("Benjamin");
        Stud c = new Stud("Carlos");
        Stud d = new Stud("Dora");

        Menge <Stud> m = new MengeDynArray<Stud>();
        m.insert(a);
        m.insert(a);
        m.insert(b);
        m.insert(c);
        m.insert(d);

        Stud[] arr = sort(m);

        for(Stud s : arr) {
            System.out.println(s);
        }

    }
}
