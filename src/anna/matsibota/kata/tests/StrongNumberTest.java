package anna.matsibota.kata.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import anna.matsibota.kata.*;

public class StrongNumberTest {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    @Test
    public void isStrongNumber() {
        Assertions.assertEquals(STRONG, StrongNumber.isStrongNumber(1));
        Assertions.assertEquals(STRONG, StrongNumber.isStrongNumber(2));
        Assertions.assertEquals(STRONG, StrongNumber.isStrongNumber(145));
        Assertions.assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        Assertions.assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        Assertions.assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }

}