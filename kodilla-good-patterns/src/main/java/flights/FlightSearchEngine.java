package flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private Connections connections = new Connections();
    private final Set<Flight> flightSet = connections.flightSet();

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

    public void searchWithStopoverFlight(String airport1, String airport2) {
        System.out.println("\nSearching for a flight with a stopover: ");

        Set<Flight> flightSet1 = flightSet.stream()
                .filter(a -> a.getArrivalAirport().equals(airport1))
                .collect(Collectors.toSet());
        Set<Flight> flightSet2 = flightSet.stream()
                .filter(a -> a.getArrivalAirport().equals(airport2))
                .collect(Collectors.toSet());

        for(Flight flight1 : flightSet1){
            for(Flight flight2 : flightSet2){
                if(flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }

    }

}
