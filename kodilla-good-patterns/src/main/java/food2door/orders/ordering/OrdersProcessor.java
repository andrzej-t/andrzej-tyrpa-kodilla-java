package food2door.orders.ordering;

public class OrdersProcessor {
    private OrdersService ordersService;
    private OrdersRepository ordersRepository;

    public OrdersProcessor(OrdersService ordersService, OrdersRepository ordersRepository) {
        this.ordersService = ordersService;
        this.ordersRepository = ordersRepository;
    }

    public OrdersDto process(final  OrdersRequest ordersRequest) {
        boolean isOrdered = ordersService.order(ordersRequest.getSupplier(), ordersRequest.getGoods());

        if (isOrdered) {
            ordersRepository.createOrder(ordersRequest.getSupplier(), ordersRequest.getGoods());
            System.out.println("The order has been accepted!");
            return new OrdersDto(ordersRequest.getSupplier(), true);
        } else {
            System.out.println("Unfortunately this order can not be accepted! ");
            return new OrdersDto(ordersRequest.getSupplier(), false);
        }
    }
}
