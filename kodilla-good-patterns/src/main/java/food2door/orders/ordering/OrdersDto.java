package food2door.orders.ordering;

import food2door.orders.suppliers.Supplier;

public class OrdersDto {
    private final Supplier supplier;
    private final boolean isOrdered;

    public OrdersDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
