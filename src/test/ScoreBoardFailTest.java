package test;

import livescorefootball.ScoreBoard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreBoardFailTest {
    private ScoreBoard scoreboard;

    @BeforeEach
    public void setUp() {
        scoreboard = new ScoreBoard();
    }

    @Test
    public void testStartMatch() {
        scoreboard.startMatch();
        assertEquals(0, scoreboard.getMatchesInProgressSummary().size());
    }

    //passing test
    //@Test
    //public void testStartMatch() {
        //scoreboard.startMatch();
        //assertEquals(1, scoreboard.getMatchesInProgressSummary().size());
    }

