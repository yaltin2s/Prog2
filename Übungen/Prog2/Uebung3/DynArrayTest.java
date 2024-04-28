package Uebung3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynArrayTest {

    static DynArray<Integer> da;
    static DynArray<String> sa;


    @BeforeEach
    void init() {
        da = new DynArray<>();
        sa = new DynArray<>();
        for (int i = 0; i <= 4; i++) {
            da.add(i+10);
        }
        da.add(12);
    }

    @Test
    void testAdd() {
        int s = da.size();
        da.add(20);
        assertEquals(s+1, da.size());
        assertTrue(sa.isEmpty());
        sa.add("hey");
        assertEquals("hey", sa.get(0));
    }


    @Test
    void testBounds() {
        assertThrows(IndexOutOfBoundsException.class, ()->{da.get(10);});
        assertThrows(IndexOutOfBoundsException.class, ()->{da.get(-3);});
        assertThrows(IndexOutOfBoundsException.class, ()->{sa.set(1, "Hey");});
    }

    @Test
    void testGetSet() {
        da.show();
        assertEquals(12, da.get(2));
        int s = da.size();
        da.set(3,  20);
        assertEquals(s, da.size());
        assertEquals(20, da.get(3));
        assertEquals(s, da.size());
    }

}