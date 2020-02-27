package matsibota.kata.tests;

import matsibota.kata.FootballMatch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FootballMatchTest {
    FootballMatch firstMatch = new FootballMatch();

    @Test
    void matchResult() {
        Assertions.assertEquals(2, firstMatch.matchResult(1, 2, 1 , 2));
        Assertions.assertEquals(1, firstMatch.matchResult(1, 2, 3 , 4));
        Assertions.assertEquals(0, firstMatch.matchResult(1, 2, 3 , 0));
        Assertions.assertEquals(2, firstMatch.matchResult(8, 2, 8 , 2));
        Assertions.assertEquals(1, firstMatch.matchResult(5, 2, 8 , 5));
        Assertions.assertEquals(0, firstMatch.matchResult(5, 2, 5 , 8));
        Assertions.assertEquals(1, firstMatch.matchResult(1, 2, 0 , 3));
    }
}