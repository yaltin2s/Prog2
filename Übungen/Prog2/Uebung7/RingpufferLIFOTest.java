package Uebung7;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class RingpufferLIFOTest {

    private Ringpuffer<Integer> intRingpuffer;

    @BeforeEach
    void setUp() {
        intRingpuffer = new RingpufferLIFO<Integer>(3);
    }

    @Test
    void testNegativeList() {
        assertThrows(IllegalArgumentException.class, ()->{
            intRingpuffer = new RingpufferLIFO<Integer>(-2);
        });
    }

    @Test
    void testAddLastAndFront() {
        intRingpuffer.add(1);
        assertEquals(1, intRingpuffer.get());
        assertEquals(1, intRingpuffer.size());

        intRingpuffer.add(2);
        assertEquals(2, intRingpuffer.get());
        assertEquals(2, intRingpuffer.size());

        intRingpuffer.add(3);
        assertEquals(3, intRingpuffer.get());
        assertEquals(3, intRingpuffer.size());
    }

    @Test
    void testRemoveFirst() {
        intRingpuffer.add(1);
        intRingpuffer.add(2);
        intRingpuffer.add(3);

        intRingpuffer.remove();
        assertEquals(3, intRingpuffer.get());
        assertEquals(2, intRingpuffer.size());
    }

    @Test
    void testFrontEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            intRingpuffer.get();
        });
    }

    @Test
    void testContains() {
        intRingpuffer.add(1);
        intRingpuffer.add(2);
        intRingpuffer.add(3);

        assertTrue(intRingpuffer.contains(1));
        assertTrue(intRingpuffer.contains(2));
        assertTrue(intRingpuffer.contains(3));
        assertFalse(intRingpuffer.contains(4));
    }

    @Test
    void testUeberschreiben() {
        intRingpuffer.add(1);
        intRingpuffer.add(2);
        intRingpuffer.add(3);
        intRingpuffer.add(4);

        assertFalse(intRingpuffer.contains(1));
        assertEquals(4, intRingpuffer.get());
        assertEquals(3, intRingpuffer.size());
    }

    @Test
    public void testIterator() {
        Iterator<Integer> iterator = intRingpuffer.iterator();
        intRingpuffer.add(1);
        intRingpuffer.add(2);
        intRingpuffer.add(3);
        intRingpuffer.add(4);
        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertFalse(iterator.hasNext());
    }

}