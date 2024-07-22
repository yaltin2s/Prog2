package Uebung8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FolgeUtilTest {



    private Folge<Integer> folge;



    @BeforeEach
    public void setUp() {
        folge = new FolgeDynArray<>();
    }

    @Test
    public void frequency() {
        folge.addLast(1);
        folge.addLast(3);
        folge.addLast(2);
        folge.addLast(3);
        folge.addLast(3);
        folge.addLast(2);
        assertEquals(1, FolgeUtil.frequency(folge, 1));
        assertEquals(2, FolgeUtil.frequency(folge, 2));
        assertEquals(3, FolgeUtil.frequency(folge, 3));
    }

    @Test
    public void swap() {
        folge.addLast(1);
        folge.addLast(2);
        assertEquals(1, folge.get(0));
        assertEquals(2, folge.get(1));
        FolgeUtil.swap(folge, 0, 1);
        assertEquals(2, folge.get(0));
        assertEquals(1, folge.get(1));
    }

    @Test
    public void rotate() {
        folge.addLast(10);
        folge.addLast(42);
        folge.addLast(0);
        folge.addLast(8);
        folge.addLast(15);
        assertEquals(10, folge.get(0));
        assertEquals(42, folge.get(1));
        assertEquals(0, folge.get(2));
        assertEquals(8, folge.get(3));
        assertEquals(15, folge.get(4));
        FolgeUtil.rotate(folge, 2);
        assertEquals(8, folge.get(0));
        assertEquals(15, folge.get(1));
        assertEquals(10, folge.get(2));
        assertEquals(42, folge.get(3));
        assertEquals(0, folge.get(4));
    }
}