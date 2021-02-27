package com.kodilla.stream.world;

import java.util.List;

public final class Continent {

    private final String continentName;
    final List<Country> countries;

    public Continent(final String continentName, final List<Country> countries) {
        this.continentName = continentName;
        this.countries=countries;
    }

    Country country = new Country(getCountry().getCountryName(), getCountry().getPeopleQuantity());

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public Country getCountry() {
        return country;
    }
}
