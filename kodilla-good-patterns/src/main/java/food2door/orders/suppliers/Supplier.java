package food2door.orders.suppliers;

import food2door.orders.goods.Goods;
import food2door.orders.ordering.OrdersDto;
import food2door.orders.ordering.OrdersRequest;

import java.util.List;

public interface Supplier {

    String getSupplierName();
    List<Goods> getListOfGoods();
    OrdersDto process(OrdersRequest orderRequest);

}
