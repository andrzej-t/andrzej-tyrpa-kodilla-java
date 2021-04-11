package food2door.orders;

import food2door.orders.ordering.OrdersRequest;
import food2door.orders.ordering.OrdersRequestRetriever;

public class App {
    public static void main(String[] args) {

        OrdersRequestRetriever ordersRequestRetriever = new OrdersRequestRetriever();
        OrdersRequest ordersRequest = ordersRequestRetriever.retrieve();

        Processor processor = new Processor();
        processor.start(ordersRequest);
    }
}
