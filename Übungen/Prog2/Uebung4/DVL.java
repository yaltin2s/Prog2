package Uebung4;

import java.util.NoSuchElementException;

/*
     Double verkettete Liste
*/

public class DVL<T>{
    private int size;
    listenElement first;
    listenElement last;

    class  listenElement{

        T value;
        listenElement next;
        listenElement prev;
        public listenElement(T v){
            value=v;
            next= null;
            prev= null;
        }
    }

    boolean isEmpty(){

        return first==null;
    }
    T getFirst(){

        return first.value;
    }
    T getLast() throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException ("Liste leer");

        return last.value;
    }

    void insert( T v){
        listenElement elem= new listenElement ( v );
        if (isEmpty ()) {
            first= last= elem;
            size++;
        }
        else {
            elem.next = first;
            elem.next.prev = elem;
            first = elem;
            size++;
        }
    }
    void append( T v){
        listenElement e= new listenElement ( v );
        if (isEmpty ()) {
            first= last= e;
            size++;
        }
        else {
            e.prev= last;
            last.next= e;
            last= e;
            size++;
        }
    }
    void removeFirst() throws NoSuchElementException{
        if(isEmpty ()) throw new NoSuchElementException ("Leer");
        if(first.next== null){
            first=last= null;
            size--;
            return;
        }
        first=first.next;
        first.prev=null;
        size--;
    }
    void removeLast(){
        if (isEmpty ()) return;
        if (size == 1) {
            removeFirst ();
            return;
        }
        last.prev.next= null;
        last= last.prev;
        size--;
    }
    boolean contains( T v){
        if(isEmpty ()) return false;
        listenElement e =first;

//        while (elem.next != null){
//            if(elem.value == v){
//                return true;
//            }
//            elem=elem.next;
//        }
//
//        return false;

        while (!e.value.equals(v) && e.next != null) {
            e = e.next;
        }
        return e.value.equals(v);
    }
    void delete (T v){
        if (isEmpty ()|| !contains ( v )) return;
        if (first.value.equals ( v )){
            removeFirst ();
            return;
        }
        if (last.value.equals ( v )){
            removeLast ();
            return;
        }
        listenElement elem = first;
        while (!elem.value.equals ( v )) {
            elem= elem.next;
        }
        elem.prev.next = elem.next;
        elem.next.prev = elem.prev;
        size--;

    }
}