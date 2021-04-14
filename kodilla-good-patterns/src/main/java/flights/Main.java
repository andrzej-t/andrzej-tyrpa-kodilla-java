package flights;

public class Main {

    public static void main(String[] args) {

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        flightSearchEngine.searchDepartureFromAirport("Gdańsk");
        flightSearchEngine.searchToArrivalAirport("Wrocław");
        flightSearchEngine.searchWithStopoverFlight("Kraków", "Wrocław", "Gdańsk");

    }
}

