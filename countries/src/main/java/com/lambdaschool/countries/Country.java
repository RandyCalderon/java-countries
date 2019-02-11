package com.lambdaschool.countries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String countryName;
    private int countryAge;
    private int landingMassSize;
    private int population;

    public Country(String countryName, int countryAge, int landingMassSize, int population) {
        this.id = counter.incrementAndGet();
        this.countryName = countryName;
        this.countryAge = countryAge;
        this.population = population;
        this.landingMassSize = landingMassSize;
    }

    public long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryAge() {
        return countryAge;
    }

    public void setCountryAge(int countryAge) {
        this.countryAge = countryAge;
    }

    public int getLandingMassSize() {
        return landingMassSize;
    }

    public void setLandingMassSize(int landingMassSize) {
        this.landingMassSize = landingMassSize;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
