public class Lifo{
 Integer[] array; // storage
 int size = 0; // current size
    public Lifo(int s) {
         array = new Integer[s];
        size = 0;
    }
public void push(Integer i) {array[size++] = i;}
public Integer pop() {return array[--size];}
}