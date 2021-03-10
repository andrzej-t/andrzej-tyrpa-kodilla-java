package com.kodilla.exception.test;

public class FlightApp {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        try {
            if (flightSearch.findFlight(new Flight("Warsaw", "Canberra"))) {
                System.out.println("The connection is possible.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("The connection is impossible.");
        }

    }

}
