package flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private Connections connections = new Connections();
    private Set<Flight> flightSet = connections.flightSet();

    public void searchToArrivalAirport(String airport) {
        System.out.println("\nSearching flights to arrival airport: ");
        flightSet.stream()
                .filter(a -> a.getArrivalAirport().equals(airport))
                .forEach(System.out::println);
    }

    public void searchDepartureFromAirport(String airport) {
        System.out.println("\nSearching flights from departure airport: ");
        flightSet.stream()
                .filter(a -> a.getDepartureAirport().equals(airport))
                .forEach(System.out::println);
    }

}
