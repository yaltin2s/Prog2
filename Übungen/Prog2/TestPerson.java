import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPerson {
	
	static Stud sa = new Stud("Anna", 1999);
	static Stud sb  = new Stud("Ben", 2002);
	static Boxer bb = new Boxer("Ben", 2002, 88.5);
	static Stud sa2 = new Stud("Anna", 1999);
	static Boxer bb2 = new Boxer("Ben", 2002, 100.1);
	
	static Person pa;
	static Person psb;
	static Person pbb;
	static Person pa2;
	static Person pb2;
	static Person pnull;
	
	@BeforeEach
	void init() {
		pa = (Person) sa;
		psb = (Person) sb;
		pbb = (Person) bb;
		pa2 = (Person) sa2;
		pb2 = (Person) bb2;
	}
	
	@Test
	void testgetMatrikelnummer() {
		assertEquals(100, sa.getMatrikelnummer());
		assertEquals(101, sb.getMatrikelnummer());
		assertEquals(102, sa2.getMatrikelnummer());
	}
	
	@Test
	void testGetGewicht() {
		assertEquals(88.5, bb.getGewicht(), 0.0001);
		bb.setGewicht(98.5);
		assertEquals(98.5, bb.getGewicht(), 0.0001);
	}

	@Test
	void testClassCastException() {
		assertThrows(ClassCastException.class, ()-> bb = (Boxer) pa);
	}

	@Test
	void testequalreflexiv(){
		Stud stud = new Stud ( "Mark", 1991 );
		assertEquals ( stud,stud );

		Boxer boxer = new Boxer ( "Luka",1992, 62.5 );
		//assertEquals ( boxer,boxer );
	}

	@Test
	void testEqualSymertisch(){
		Stud stud1 = new Stud("Alice", 1995);
		Stud stud2 = new Stud("Alice", 1995);
		// Wenn Objekt A gleich Objekt B ist, dann ist Objekt B auch gleich Objekt A.
		assertEquals ( stud1,stud2 );
		assertEquals ( stud2,stud1 );
	}



}
