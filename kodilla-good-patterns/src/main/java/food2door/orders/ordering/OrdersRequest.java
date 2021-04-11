package food2door.orders.ordering;

import food2door.orders.goods.Goods;
import food2door.orders.suppliers.Supplier;

public class OrdersRequest {
    private final Supplier supplier;
    private final Goods goods;

    public OrdersRequest(Supplier supplier, Goods goods) {
        this.supplier = supplier;
        this.goods = goods;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Goods getGoods() {
        return goods;
    }
}
