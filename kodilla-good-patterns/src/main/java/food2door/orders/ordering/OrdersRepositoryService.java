package food2door.orders.ordering;

import food2door.orders.goods.Goods;
import food2door.orders.suppliers.Supplier;

public class OrdersRepositoryService implements OrdersRepository {

    @Override
    public boolean createOrder(Supplier supplier, Goods goods) {
        return true;
    }
}
