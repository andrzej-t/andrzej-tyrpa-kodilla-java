package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightsMap = new HashMap<>();

        flightsMap.put("Warsaw", true);
        flightsMap.put("Delhi", true);
        flightsMap.put("Tbilisi", true);
        flightsMap.put("Kinshasa", true);
        flightsMap.put("Bogota", true);

        if (flightsMap.containsKey(flight.getArrivalAirport()) && flightsMap.containsKey(flight.getDepartureAirport())) {
            return true;
        }
        throw new RouteNotFoundException("There is no such a connection!");
    }

}
