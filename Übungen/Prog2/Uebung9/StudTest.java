package Uebung9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudTest {

    private Stud john;
    private Stud jane;

    @BeforeEach
    void setUp(){
        john = new Stud("John");
        jane = new Stud ( "Jane" );
    }

    @Test
    void compareTo() {
        assertTrue ( john.compareTo ( john )==0 );
        assertTrue ( jane.compareTo ( jane )==0 );
        assertTrue ( john.compareTo ( jane )< 0 );
        assertTrue ( jane.compareTo ( john )>0 );
    }
}