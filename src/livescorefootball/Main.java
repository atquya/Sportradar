package livescorefootball;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.scoreBoardTimer();


        //Start random first matches
        for (int i = 0; i < 5; i++) {
            scoreBoard.startMatch();
        }

        // Update scores randomly
        for (int matchIndex = 0; matchIndex < 5; matchIndex++) {
            int homeScore = getRandomScore();
            int awayScore = getRandomScore();
            scoreBoard.updateScore(matchIndex, homeScore, awayScore);
        }

        // Finished match and Summary with a timer execution
        int randomMatchIndex = getRandomMatchIndex(scoreBoard.getMatchesInProgressSummary().size());
        scoreBoard.finishedMatch(randomMatchIndex);
    }

    private static int getRandomMatchIndex(int size) {
        return (int) (Math.random() * size); // Generates a random match index based on the size
    }

    private static int getRandomScore() {
        return (int) (Math.random() * 10);// Generates Random Numbers for scores
    }
}