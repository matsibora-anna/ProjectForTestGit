import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballMatchTest {
    FootballMatch firstMatch = new FootballMatch();

    @Test
    void matchResult() {
        assertEquals(2, firstMatch.matchResult(1, 2, 1 , 2));
        assertEquals(1, firstMatch.matchResult(1, 2, 3 , 4));
        assertEquals(0, firstMatch.matchResult(1, 2, 3 , 0));
        assertEquals(2, firstMatch.matchResult(8, 2, 8 , 2));
        assertEquals(1, firstMatch.matchResult(5, 2, 8 , 5));
        assertEquals(0, firstMatch.matchResult(5, 2, 5 , 8));
        assertEquals(1, firstMatch.matchResult(1, 2, 0 , 3));
    }
}