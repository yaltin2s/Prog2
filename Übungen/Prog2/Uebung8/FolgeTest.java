package Uebung8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class FolgeTest {



    private Folge<Integer> uut;



    @BeforeEach
    public void setUp() {
        uut = new FolgeDynArray<>();
    }

    @Test
    public void isEmpty() {
        assertTrue(uut.isEmpty());
        uut.addFirst(1);
        assertFalse(uut.isEmpty());
    }

    @Test
    public void size() {
        assertEquals(0, uut.size());
        uut.addFirst(1);
        assertEquals(1, uut.size());
    }

    @Test
    public void contains() {
        assertFalse(uut.contains(1));
        uut.addFirst(1);
        assertTrue(uut.contains(1));
    }

    @Test
    public void get() {
        assertThrows(IndexOutOfBoundsException.class, () -> uut.get(0));
        uut.addFirst(1);
        assertEquals(1, uut.get(0));
    }

    @Test
    public void set() {
        assertThrows(IndexOutOfBoundsException.class, () -> uut.set(0, 1));
        uut.addFirst(2);
        assertEquals(2, uut.get(0));
        uut.set(0, 1);
        assertEquals(1, uut.get(0));
    }

    @Test
    public void pos() {
        assertThrows(NoSuchElementException.class, () -> uut.pos(0));
        uut.addFirst(2);
        assertEquals(0, uut.pos(2));
        uut.addFirst(1);
        assertEquals(1, uut.pos(2));
    }

    @Test
    public void insert() {
        uut.insert(0, 2);
        uut.insert(0, 1);
        assertEquals(1, uut.get(0));
        assertEquals(2, uut.get(1));
    }

    @Test
    public void addFirst() {
        uut.addFirst(2);
        uut.addFirst(1);
        assertEquals(1, uut.get(0));
        assertEquals(2, uut.get(1));
    }

    @Test
    public void addLast() {
        uut.addLast(1);
        uut.addLast(2);
        assertEquals(1, uut.get(0));
        assertEquals(2, uut.get(1));
    }

    @Test
    public void delete() {
        uut.addLast(1);
        uut.addLast(2);
        assertTrue(uut.contains(1));
        assertTrue(uut.contains(2));
        assertEquals(2, uut.get(1));
        uut.delete(1);
        assertEquals(2, uut.get(0));
        uut.delete(2);
        assertFalse(uut.contains(1));
        assertFalse(uut.contains(2));
    }

    @Test
    public void remove() {
        assertEquals(0, uut.size());
        uut.addLast(1);
        uut.addLast(2);
        uut.addLast(3);
        assertTrue(uut.contains(1));
        assertTrue(uut.contains(2));
        assertTrue(uut.contains(3));
        assertEquals(3, uut.get(2));
        uut.remove(1);
        assertFalse(uut.contains(2));
        assertEquals(3, uut.get(1));
        uut.remove(0);
        assertFalse(uut.contains(1));
        assertEquals(3, uut.get(0));
        uut.remove(0);
        assertFalse(uut.contains(3));
        assertTrue(uut.isEmpty());
    }
}