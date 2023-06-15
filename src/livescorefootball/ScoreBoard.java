package livescorefootball;

import java.util.*;

/**
 * Represents the Score board.
 */
public class ScoreBoard {
    private List<Matches> match; // List to store the matches
    private Random random; // Random number generator
    private List<String> countryName; // List to store country names
    private Timer timer;

    /**
     * Initializes new instance of the class ScoreB.
     * Initializes the list of the Matches.
     * Generate Random number and Country names.
     */
    public ScoreBoard() {
        this.match = new ArrayList<>();
        this.random = new Random();
        this.countryName = generateCountryNameList();
        this.timer = new Timer();
    }

    /**
     * Starts Random First Matches
     */
    public void startMatch() {
        String homeTeam = getRandomCountries();
        String awayTeam = getRandomCountries();
        Matches matches = new Matches(homeTeam, awayTeam);
        match.add(matches);
        System.out.println("Started a new match between: " + homeTeam + " and " + awayTeam);

    }

    /**
     * Generates Random country combination
     */
    private String getRandomCountries() {
        int randomCountryIndex = random.nextInt(countryName.size());
        return countryName.remove(randomCountryIndex);
    }

    /**
     * Country Index
     */
    private List<String> generateCountryNameList() {
        List<String> country = new ArrayList<>();
        country.add("Australia");
        country.add("Argentina");
        country.add("Brazil");
        country.add("Canada");
        country.add("France");
        country.add("Germany");
        country.add("Italy");
        country.add("Mexico");
        country.add("Spain");
        country.add("Uruguay");
        return country;
    }

    /**
     * Updates Score of the matches
     */
    public void updateScore(int matchIndex, int homeScore, int awayScore) {
        if (matchIndex >= 0 && matchIndex < match.size()) {
            Matches matches = match.get(matchIndex);
            matches.setHomeScore(homeScore);
            matches.setAwayScore(awayScore);
            System.out.println("Updated score for match " + matchIndex + ": " +
                    matches.getHomeTeam() + " " + homeScore + " - " + awayScore + " " + matches.getAwayTeam());
        } else {
            System.out.println("Invalid match index.");
        }
    }

    /**
     * Finished matches are showed
     */
    public void finishedMatch(int matchIndex) {
        if (matchIndex >= 0 && matchIndex < match.size()) {
            Matches matches = match.remove(matchIndex);
            System.out.println("Match " + matchIndex + " finished: " +
                    matches.getHomeTeam() + " " + matches.getHomeScore() + " - " +
                    matches.getAwayScore() + " " + matches.getAwayTeam());
        } else {
            System.out.println("Invalid match index.");
        }
    }

    /**
     * Refreshes the summary
     */
    public void scoreBoardTimer() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                List<Matches> matchesInProgress = getMatchesInProgressSummary();
                System.out.println("Matches in Progress Summary:");
                for (int i = 0; i < matchesInProgress.size(); i++) {
                    Matches m = matchesInProgress.get(i);
                    System.out.println((i + 1) + ". " + m.getHomeTeam() + " " +
                            m.getHomeScore() + " - " + m.getAwayScore() + " " + m.getAwayTeam());
                }
            }
        }, 0, 10000);
    }

    /**
     * Generates Summary of all matches
     */
    public List<Matches> getMatchesInProgressSummary() {
        List<Matches> matchesInProgress = new ArrayList<>(match);
        matchesInProgress.sort(Comparator.comparingInt((Matches m) -> m.getHomeScore() + m.getAwayScore())
                .reversed()
                .thenComparingInt(match::indexOf));
        return matchesInProgress;
    }
}
