package food2door.orders;

import food2door.orders.ordering.OrdersRequest;
import food2door.orders.suppliers.Supplier;

public class Processor {

    public void start(OrdersRequest ordersRequest) {
        Supplier supplier = ordersRequest.getSupplier();
        supplier.process(ordersRequest);
    }
}
