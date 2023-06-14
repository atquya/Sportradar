package com.atquya.liveFootballScore;

public class Main {
    public static void main(String[] args) {
        ScoreB scoreB = new ScoreB();

        //Start random first matches
        for (int i = 0; i < 5; i++) {
            scoreB.startMatch();
        }

        // Update scores randomly
        for (int matchIndex = 0; matchIndex < 5; matchIndex++) {
            int homeScore = getRandomScore();
            int awayScore = getRandomScore();
            scoreB.updateScore(matchIndex, homeScore, awayScore);
        }
    }

    /**
     * Randomly generates number
     * using it to show scores randomly
     */
    private static int getRandomScore() {
        return (int) (Math.random() * 10);
    }
}