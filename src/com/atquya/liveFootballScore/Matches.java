package com.atquya.liveFootballScore;

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
     * @param homeTeam
     * @param awayTeam
     */
    public Matches (String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }


}
