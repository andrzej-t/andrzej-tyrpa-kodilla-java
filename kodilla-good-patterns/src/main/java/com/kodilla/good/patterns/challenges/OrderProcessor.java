package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;
    private Repository repository;
    private Payment payment;


    public OrderProcessor(final OrderService orderService, final InformationService informationService, final Repository repository, final Payment payment) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.repository = repository;
        this.payment = payment;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getClient(), orderRequest.getDateOfOrder(), orderRequest.getCashPayment(), orderRequest.getProduct());
        if (isOrdered) {
            informationService.inform(orderRequest.getClient());
            repository.createOrder(orderRequest.getClient());
            return new OrderDto(orderRequest.getClient(), true);
        } else {
            return new OrderDto(orderRequest.getClient(), false);
        }

    }

}
