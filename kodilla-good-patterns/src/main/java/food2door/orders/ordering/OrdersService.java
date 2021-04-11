package food2door.orders.ordering;

import food2door.orders.goods.Goods;
import food2door.orders.suppliers.Supplier;

public interface OrdersService {
    boolean order (Supplier supplier, Goods goods);
}
