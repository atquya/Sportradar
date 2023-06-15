package livescorefootball;

/**
 * Represents Football match between the teams.
 */

public class Matches {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    /**
     * Initializes a new instance of Matches class
     * Initial Score is set to 0-0
     */
    public Matches (String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        homeScore = 0;
        awayScore = 0;
    }

    /**
     * sets home team score
     */
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    /**
     * Sets away team score
     */
    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    /**
     * Returns home team names
     */
    public String getHomeTeam() {
        return homeTeam;
    }

    /**
     * Returns away team names
     */
    public String getAwayTeam() {
        return awayTeam;
    }

    /**
     * Returns home scores
     */
    public int getHomeScore() {
        return homeScore;
    }

    /**
     * Returns away score
     */
    public int getAwayScore() {
        return awayScore;
    }
}
