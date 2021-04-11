package food2door.orders.ordering;

import food2door.orders.goods.Goods;
import food2door.orders.suppliers.ExtraFoodShop;
import food2door.orders.suppliers.Supplier;

public class OrdersRequestRetriever {
    public OrdersRequest retrieve() {

        Supplier supplier;
        supplier = new ExtraFoodShop();
        Goods goods = supplier.getListOfGoods().get(1);

        System.out.println("Supplier: " + supplier.getSupplierName() );
        System.out.println("Product: " + goods.getGoodsType());
        System.out.println("Quantity: " + goods.getGoodsAmount());
        System.out.println("Price: " + goods.getGoodsPrice());

        return new OrdersRequest(supplier, goods);
    }
}
