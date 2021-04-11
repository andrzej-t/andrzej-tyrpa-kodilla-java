package food2door.orders;

import food2door.orders.ordering.OrdersRequest;
import food2door.orders.suppliers.ExtraFoodShop;
import food2door.orders.suppliers.GlutenFreeShop;
import food2door.orders.suppliers.HealthyShop;
import food2door.orders.suppliers.Supplier;

public class Processor {

    public void start(OrdersRequest ordersRequest) {
        Supplier supplier;
        if (ordersRequest.getSupplier().getSupplierName().equals("Extra Food Shop")) {
            supplier = new ExtraFoodShop();
        } else if (ordersRequest.getSupplier().getSupplierName().equals("Gluten Free Shop")) {
            supplier = new GlutenFreeShop();
        } else {
            supplier = new HealthyShop();
        }

        supplier.process(ordersRequest);
    }
}
