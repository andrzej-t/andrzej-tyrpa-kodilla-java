package food2door.orders;

import food2door.orders.ordering.OrdersRequest;
import food2door.orders.ordering.OrdersRequestRetriever;
import food2door.orders.suppliers.ExtraFoodShop;

public class App {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        OrdersRequestRetriever ordersRequestRetriever = new OrdersRequestRetriever();
        OrdersRequest ordersRequest = ordersRequestRetriever.retrieve(extraFoodShop);

        Processor processor = new Processor();
        processor.start(ordersRequest);
    }
}
