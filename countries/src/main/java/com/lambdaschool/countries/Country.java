package com.lambdaschool.countries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String countryName;
    private int countryAge;
    private int landMassSize;
    private int population;
    private int medianAge;

    public Country(String countryName, int countryAge, int landMassSize, int population) {
        this.id = counter.incrementAndGet();
        this.countryName = countryName;
        this.countryAge = countryAge;
        this.population = population;
        this.landMassSize = landMassSize;
        this.medianAge = medianAge;
    }

    public Country (Country toClone) {
        this.id = toClone.getId();
        this.countryName = toClone.getCountryName();
        this.countryAge = toClone.getCountryAge();
        this.population = toClone.getPopulation();
        this.landMassSize = toClone.getLandMassSize();
        this.medianAge = toClone.getMedianAge();
    }

    public long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }


    public int getCountryAge() {
        return countryAge;
    }


    public int getLandMassSize() {
        return landMassSize;
    }


    public int getPopulation() {
        return population;
    }

    public int getMedianAge() {
        return medianAge;
    }
}
