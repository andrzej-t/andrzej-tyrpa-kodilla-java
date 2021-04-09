package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private Client client;
    private LocalDateTime dateOfOrder;
    private CashPayment cashPayment;
    private Product product;

    public OrderRequest(final Client client, final LocalDateTime dateOfOrder, final CashPayment cashPayment, final Product product) {
        this.client = client;
        this.dateOfOrder = dateOfOrder;
        this.cashPayment = cashPayment;
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public CashPayment getCashPayment() {
        return cashPayment;
    }

    public Product getProduct() {
        return product;
    }
}
