package Uebung6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StapelDynArrTest {

    StapelDynArr<Integer> uut;

    @BeforeEach
    void init(){
        uut = new StapelDynArr<> ();
    }

    @Test
    void size() {
        assertEquals ( 0,uut.size () );
        uut.push ( 5 );
        assertEquals ( 1,uut.size () );
    }

    @Test
    void isEmpty() {
        assertTrue ( uut.isEmpty () );
        uut.push ( 1 );
        assertFalse ( uut.isEmpty ());
    }

    @Test
    void top() {
        uut.push ( 1 );
        uut.push ( 3 );
        assertEquals ( 3,uut.top () );
    }

    @Test
    void push() {
        assertEquals ( 0,uut.size () );
        uut.push ( 7 );
        assertEquals ( 1,uut.size () );
    }

    @Test
    void pop() {
        uut.push ( 10 );
        uut.push ( 11 );
        assertEquals (2,uut.size ()  );
        uut.pop ();
        assertEquals ( 1,uut.size () );
    }

    @Test
    void Test(){
        //isEmpty(Push)
        uut.push ( 5 );
        assertFalse ( uut.isEmpty () );
        //top(push)
        assertEquals ( 5,uut.top () );
        uut.pop ();
        assertTrue ( uut.isEmpty () );
        //top(pop(push))
        assertThrows ( NoSuchElementException.class,()-> uut.top () );
    }
}