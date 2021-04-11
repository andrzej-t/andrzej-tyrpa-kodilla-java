package food2door.orders.suppliers;

import food2door.orders.goods.Goods;
import food2door.orders.ordering.*;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier{

    private static final String SUPPLIER_NAME = "Extra Food Shop";
    private List<Goods> goods = new ArrayList<>();

    @Override
    public String getSupplierName() {
        return SUPPLIER_NAME;
    }

    @Override
    public List<Goods> getListOfGoods() {
        goods.add(new Goods("Honey", 1,10.99));
        goods.add(new Goods("Apple juice", 2, 2));

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
