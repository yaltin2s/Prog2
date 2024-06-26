package Uebung6;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class StapelTest {

    /* Instanzvariablen */

    private Stapel<Integer> uut;    // uut: unit under test

    /* Instanzmethoden */

    @BeforeEach
    public void init() {
        uut = new StapelEVL<>();
    }

    @Test
    public void testStapel() {

        // isempty(push(s,e)) = false
        uut.push(1);
        assertFalse(uut.isEmpty());

        // top(push(s, e)) = e
        assertEquals(1, uut.top());
        uut.pop();

        // "top(pop(push(s, e))) = top(s)" mit anfangs leerem Stack
        assertTrue(uut.isEmpty());
        assertThrows(NoSuchElementException.class, () -> uut.top());

        // "top(pop(push(s, e))) = top(s)" mit anfangs nicht-leerem Stack
        uut.push(2);
        assertFalse(uut.isEmpty());
        int top = uut.top();
        uut.push(3);
        uut.pop();
        assertEquals(top, uut.top());
    }
}
