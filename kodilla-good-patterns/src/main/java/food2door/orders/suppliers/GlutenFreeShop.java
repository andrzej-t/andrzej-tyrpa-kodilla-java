package food2door.orders.suppliers;

import food2door.orders.goods.Goods;
import food2door.orders.ordering.*;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Supplier {
    private static final String SUPPLIER_NAME = "Gluten Free Shop";
    private List<Goods> goods = new ArrayList<>();

    @Override
    public String getSupplierName() {
        return SUPPLIER_NAME;
    }

    @Override
    public List<Goods> getListOfGoods() {
        goods.add(new Goods("Corn flakes", 2,5.20));
        goods.add(new Goods("Coconut", 1, 3.30));

        return goods;
    }

    @Override
    public OrdersDto process(final OrdersRequest ordersRequest) {
        if (ordersRequest.getSupplier().getSupplierName().equals(SUPPLIER_NAME)) {
            OrdersProcessor ordersProcessor = new OrdersProcessor(new GoodsOrdersService(), new OrdersRepositoryService());
            return ordersProcessor.process(ordersRequest);
        }
        return new OrdersDto(ordersRequest.getSupplier(), false);
    }
}
