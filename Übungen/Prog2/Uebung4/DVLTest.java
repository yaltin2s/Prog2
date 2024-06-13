package Uebung4;

import org.junit.jupiter.api.*;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class DVLTest {
    private DVL<Integer> uut;

    @BeforeEach
    void init(){
        uut = new DVL<> ();
    }

    @Test
    void isEmpty() {
        assertTrue ( uut.isEmpty () );
        uut.insert ( 5 );
        assertFalse (uut.isEmpty ());
    }

    @Test
    void getFirst() {
        uut.insert ( 5 );//[1,4,5]
        uut.insert ( 4 );
        uut.insert ( 1 );
        assertEquals ( 1,uut.getFirst () );
    }

    @Test
    void getLast() {
        uut.insert ( 5 );
        uut.insert ( 4 );
        uut.insert ( 1 );
        assertEquals ( 5,uut.getLast () );
    }

    @Test
    void insert() {
        assertEquals ( 0,uut.size () );
        uut.insert ( 6 );//
        assertEquals ( 1,uut.size ());
    }

    @Test
    void append() {
        uut.insert ( 5 );
        uut.insert ( 4 );
        uut.insert ( 1 );
        uut.append ( 15 );
        assertEquals ( 15,uut.getLast () );
    }

    @Test
    void removeFirst() {
        uut.insert ( 5 );
        uut.insert ( 4 );
        uut.insert ( 1 );
        assertEquals ( 1,uut.getFirst () );
        uut.removeFirst ();
        assertEquals ( 4,uut.getFirst () );

    }

    @Test
    void removeLast() {
        uut.insert ( 5 );
        uut.insert ( 4 );
        uut.insert ( 1 );
        assertEquals ( 5,uut.getLast () );
        uut.removeLast ();
        assertEquals ( 4,uut.getLast () );
    }

    @Test
    void contains() {
        uut.insert ( 5 );//[1,4,5]
        uut.insert ( 4 );
        uut.insert ( 1 );
        assertTrue ( uut.contains ( 4 ) );
        assertTrue ( uut.contains ( 5 ) );
        assertTrue ( uut.contains ( 1 ) );
        assertFalse ( uut.contains ( 7 ) );
    }

    @Test
    void delete() {
        uut.insert ( 5 );
        uut.insert ( 4 );
        uut.insert ( 1 );
        assertEquals ( 3,uut.size () );
        uut.delete ( 4 );
        assertFalse ( uut.contains ( 4 ) );
        assertEquals ( 2,uut.size () );
    }
    @Test
    void Exception() {
        assertThrows(NoSuchElementException.class, ()->uut.getFirst());
        assertThrows(NoSuchElementException.class, ()->uut.getLast());
    }
}
