package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
       Country country1 = new Country("USA", BigDecimal.valueOf(222222222));
       Country country2 = new Country("Canada", BigDecimal.valueOf(222222222));
       final List<Country> countries=new ArrayList<>();
       countries.add(country1);
       countries.add(country2);

       Continent continent1 = new Continent("America", countries);
       final List<Continent> continents = new ArrayList<>();
       continents.add(continent1);
       World world = new World(continents);

       //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = BigDecimal.valueOf(444444444);
        //Then
        assert expected==result;

    }
}
