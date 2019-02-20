package com.lambdaschool.countries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String countryName;
    private int countryAge;
    private int landMassSize;
    private int population;

    public Country(String countryName,  int population, int landMassSize, int countryAge) {
        this.id = counter.incrementAndGet();
        this.countryName = countryName;
        this.population = population;
        this.landMassSize = landMassSize;
        this.countryAge = countryAge;
    }

    public Country (Country toClone) {
        this.id = toClone.getId();
        this.countryName = toClone.getCountryName();
        this.population = toClone.getPopulation();
        this.landMassSize = toClone.getLandMassSize();
        this.countryAge = toClone.getCountryAge();
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

}
