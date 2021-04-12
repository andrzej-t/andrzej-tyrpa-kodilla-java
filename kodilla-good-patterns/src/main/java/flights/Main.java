package flights;

public class Main {

    public static void main(String[] args) {

        FlightOrderRequestRetriever flightOrderRequestRetriever = new FlightOrderRequestRetriever();
        FlightOrderRequest flightOrderRequest = flightOrderRequestRetriever.retrieves();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        flightSearchEngine.search();
    }
}

