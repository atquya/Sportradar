package com.atquya.liveFootballScore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents the Score board.
 */
public class ScoreB {
    private final List<Matches> match; // List to store the matches
    private final Random random; // Random number generator
    private final List<String> countryName; // List to store country names

    /**
     * Initializes new instance of the class ScoreB.
     * Initializes the list of the Matches.
     * Generate Random number and Country names.
     */
    public ScoreB() {
        this.match = new ArrayList<>();
        this.random = new Random();
        countryName = generateCountryNameList();
    }

    public void startMatch() {
        String homeTeam = getRandomCountries();
        String awayTeam = getRandomCountries();
        Matches matches = new Matches(homeTeam, awayTeam);
        match.add(matches);
        System.out.println("Started a new match between: " + homeTeam + " and " + awayTeam);
    }

    private String getRandomCountries() {
        int randomCountryIndex = random.nextInt(countryName.size());
        return countryName.remove(randomCountryIndex);
    }

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


}
