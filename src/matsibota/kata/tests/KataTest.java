package matsibota.kata.tests;

import matsibota.kata.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KataTest {

    @Test
    void whitespaceNumber() {
        Assertions.assertEquals("\t\t\t\n", Kata.whitespaceNumber(-3));
    }
}
/*
        doTest( 1,    " \t\n");
        doTest( 0,      " \n");
        doTest(-1,   "\t\t\n");
        doTest( 2,   " \t \n");
        doTest(-3, "\t\t\t\n");
*/