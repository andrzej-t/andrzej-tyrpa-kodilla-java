package flights;

import java.util.Set;

public class FlightSearchEngine {
    private Connections connections = new Connections();
    private final Set<Flight> flightSet = connections.flightSet();
    private final Set<Flight> flightSet1 = connections.flightSet();
    private final Set<Flight> flightSet2 = connections.flightSet();
    private final Set<Flight> flightSet3 = connections.flightSet();

    public void searchToArrivalAirport(String airport) {
        System.out.println("\nSearching for flights to arrival airport: ");
        flightSet.stream()
                .filter(a -> a.getArrivalAirport().equals(airport))
                .forEach(System.out::println);
    }

    public void searchDepartureFromAirport(String airport) {
        System.out.println("\nSearching for flights from departure airport: ");
        flightSet.stream()
                .filter(a -> a.getDepartureAirport().equals(airport))
                .forEach(System.out::println);
    }

    public void searchWithStopoverFlight(String airport1, String airport2, String airport3) {
        System.out.println("\nSearching for a flight with a stopover: ");

        flightSet1.stream()
                .filter(a -> a.getDepartureAirport().equals(airport1))
                .filter(a -> a.getArrivalAirport().equals(airport2))
                .forEach(System.out::println);


        flightSet2.stream()
                .filter(a -> a.getDepartureAirport().equals(airport2))
                .filter(a -> a.getArrivalAirport().equals(airport3))
                .forEach(System.out::println);

    }

}
