package Uebung2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaareTest {
    Paare<String, Integer> Paare1, Paare2;
    @BeforeEach
    public void setUp() {
        Paare1 = new Paare<>("Hallo", 42);
        Paare2 = new Paare<>("Hallo", 42);
    }

    @Test
    public void equalsTest() {
        assertEquals(Paare1, Paare1);
        assertTrue(Paare1.equals(Paare2));
    }

    @Test
    public void toStringTest() {
        assertEquals(Paare1.toString(), Paare2.toString());
    }

    @Test
    public void getErstesTest() {
        assertEquals(Paare1.getErstes(), Paare2.getErstes());
    }

    @Test
    public void getZweitesTest() {
        assertEquals(Paare1.getZweites(), Paare2.getZweites());
    }

    @Test
    public void setBothTest() {
        Paare1.setErstes("Welt");
        Paare1.setZweites(44);
        assertEquals("Welt", Paare1.getErstes());
        assertEquals(44, Paare1.getZweites());
    }
}