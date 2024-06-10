package Uebung4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class EVLTest {

    private EVL<Integer> uut;

    @BeforeEach
    void init(){
        uut = new EVL<> ();
    }

    @Test
    void EvlTest(){
        // isEmpty test and size test******************
        assertTrue ( uut.isEmpty () );
        assertEquals ( 0,uut.size () );

        // insert Test********************************* [5]
        uut.insert ( 5 );
        assertFalse ( uut.isEmpty () );
        assertEquals ( 1,uut.size () );
        assertTrue ( uut.contains ( 5 ) );
        assertEquals ( 5,uut.getFirst () );
        assertEquals ( 5, uut.getLast () );

        //insert 7*************************************[7,5]
        uut.insert ( 7 );
        assertEquals ( 2,uut.size () );
        assertTrue ( uut.contains ( 7 ) );
        assertEquals ( 7,uut.getFirst () );
        assertEquals ( 5, uut.getLast () );

        //append 10 ************************************[7,5,10]
        uut.append ( 10 );
        assertEquals ( 3,uut.size () );
        assertTrue ( uut.contains ( 10 ) );
        assertEquals ( 7,uut.getFirst () );
        assertEquals ( 10, uut.getLast () );

        //delete 5*************************************[7,10]
        uut.delete (5);
        assertEquals ( 2,uut.size () );
        assertFalse ( uut.contains ( 5 ) );
        assertEquals ( 7,uut.getFirst () );
        assertEquals ( 10,uut.getLast () );

        //RemoveFirst***********************************[10]
        uut.removeFirst ();
        assertFalse ( uut.contains ( 7 ) );
        assertEquals ( 1,uut.size () );
        assertTrue ( uut.getFirst ().equals ( uut.getLast () ) );
        assertFalse ( uut.isEmpty () );

        //RemoveLast ************************************[]
        uut.removeLast();
        assertEquals(0, uut.size());
        assertFalse(uut.contains(10));
        assertTrue(uut.isEmpty());

        //Exception Test
        assertThrows ( NoSuchElementException.class,()-> uut.getFirst () );
        assertThrows ( NoSuchElementException.class,()-> uut.getLast () );
    }

}